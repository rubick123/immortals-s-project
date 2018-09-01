public class LuceneManager{
    public IndexWriter getIndexWriter() throws Exception{
		Directory directory = FSDirectory.open(new File("D:..."));
	    Analyzer analyzer = new StandardAnalyzer();//官方推荐
	    IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
	    return new IndexWriter(dirtory,config);
	}
	//全删除
	@Test
	public void testAllDelete() throws Exception{
	    IndexWriter indexWriter = getIndexWriter();
	    indexWriter.deleteAll();
		indexWriter.close();
	}
	//根据条件删除
	@Test
	public void testDelete() throws Exception{
	    IndexWriter indexWriter = getIndexWriter();
	    Query query = new TermQuery(new Term("fileName","apache"));
		indexWriter.deleteDocuments(query);
		indexWriter.close();
	}
	//修改
    @Test
	public void testUpdate() throws Exception{
	    IndexWriter indexWriter = getIndexWriter();
		Document doc = new Document();
		doc.add(new TextFiled("fileN","测试文件名"，Store.YES));
		doc.add(new TextFiled("fileC","测试文件内容和"，Store.YES));
	    indexWriter.updateDocument(new Term("fileName","lucene"),,new IKAnalyzer());
		indexWriter.close();
	}

	//IndexReader InderSearch
	public IndexSearcher getIndexSearcher() throws Exception{
	    //第一步：创建一个directory对象，也就是索引库存放的位置
	    Directory directory = FSDirectory.open(new File("D:\\"));
	    //第二步：创建一个indexreader对象，需要指定directory对象
	    IndexReader indexReader = DirectoryReader.open(directory);
	    //第三步：创建一个indexsearch对象，需要指定indexreader对象
		return new IndexSearcher(indexReader);
	}
	//执行结果
	public void printResult(IndexSearcher indexSearcher,Query query) throws Exception{
	    //第五步：执行查询
		TopDocs topDocs = indexSearcher.search(query,2);
	    //第六步：返回结果，遍历查询结果并输出
	    ScoreDoc[] scoreDocs = topDocs.scoreDocs;
	    for (ScoreDoc scoreDoc : scoreDocs){
	        int doc = scoreDoc.doc;
		    indexSearch.doc(doc);
		    Document document = indexSearcher.doc(doc);
		    String fileName = document.get("fileName");
		    System.out.println(fileName);
		    String fileContent = document.get("fileContent");
		    System.out.println(fileContent);
		    String fileSize = document.get("fileSize");
		    System.out.println(fileSize);
		    String filePath = document.get("filePath");
		    System.out.println(filePath);
		    System.out.println("--------");
	}
	}
	//查询所有
	@Test
	public void testMatchAllDocsQuery() throws Exception{
	    IndexSearcher indexSearcher = getIndexSearcher();
		Query query = new MatchAllDocsQuery();
		printResult(indexSearcher,query);
        indexSearcher.getIndexSearcher().close();
	}
	//根据数值范围查询
	@Test
	public void testNumbericRangeQuery() throws Exception{
		IndexSearcher indexSearcher = getIndexSearcher();
        Query query = NumericRangeQuery.newLongRange("fileSize",100L,200L,true,true);
		printResult(indexSearcher,query);
		indexSearcher.getIndexSearcher().close();
	}
	//组合查询
	@Test
	public void testNumbericRangeQuery() throws Exception{
		IndexSearcher indexSearcher = getIndexSearcher();
        BooleanQuery booleanQuery = new BooleanQuery();
		Query query1 = new TermQuery(new Term("fileName","apache"));
		Query query2 = new TermQuery(new Term("fileName","lucene"));
		booleanQuery.add(query1,Occur.MUST);//must是查询语句的and  should是or  must_not是not
		booleanQuery.add(query2,Occur.SHOULD);
		printResult(indexSearcher,booleanQuery);
		indexSearcher.getIndexSearcher().close();
	}
}