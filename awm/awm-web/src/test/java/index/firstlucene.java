public class firstlucene{
    //创建索引
	@Test
	public void testIndex() throws Exception{
	//第一步：创建一个工程
	//第二步：创建一个indexwriter对象
	Directory directory = FSDirectory.open(new File("D:..."));
	Analyzer analyzer = new StandardAnalyzer();//官方推荐
	IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
	IndexWriter indexWriter = new IndexWriter(dirtory,config);
	//1)指定索引库的存放位置directory对象
	//2)制定一个分析器，对文档内容进行分析
	//第三步：创建document对象
	//第四步：创建field对象，将field添加到document对象中
	File f = new File("D://...");
	File[] listFiles = f.listFiles();
	for (File file : listFiles){
	    Document document = new Document();
	    String file_name = file.getName();
	    Field fieldNameField = new TextField("fileName",field_name,Store.YES);
		long file_size = FileUtils.sizeOf(file);
	    Field fieldSizeField = new LongField("fileSize",field_size,Store.YES);
		String file_path = file.getPath();
	    Field fieldPathField = new StoreField("filePath",field_path);
		String file_content = FileUtils.readFileToString(file);
		Field fieldContentField = new TextField("fileContent",field_content,Store.NO);
		
		document.add(fileNameField);
		document.add(fileSizeField);
		document.add(filePathField);
		document.add(fileContentField);
	}
	//第五步 使用indexwriter对象将document对象写入索引库，此过程进行索引创建。
	         将索引和document对象写入索引库
	//第六步 关闭IndexWriter
	indexWriter.close();
	}
	public void testSearch() throws Exception{
	//第一步：创建一个directory对象，也就是索引库存放的位置
	    Directory directory = FSDirectory.open(new File("D:\\"));
	//第二步：创建一个indexreader对象，需要指定directory对象
	    IndexReader indexReader = DirectoryReader.open(directory);
	//第三步：创建一个indexsearch对象，需要指定indexreader对象
	    IndexSearcher indexSearcher = new IndexSearcher(indexReader);
	//第四步：创建一个termquery对象，指定查询的域和查询的关键词
        Query query = new TermQuery(new Term("fileName","java"));
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
	//第七步：关闭indexreader对象
	indexReader.close();
	}
}