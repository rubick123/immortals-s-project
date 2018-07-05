package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;
/**
 * This is a test class,Used to test the creation and query of entities
 * @ClassName SearchManagerTest
 * @author LH
 * @Time 18/6/29 15:35
 */
public class SearchManagerTest extends GenericGenerator{

	@Autowired
	SearchManager searchmanager;
	@Test
	public void insert_Search()
	{
		for(int i=0;i<100;i++)
		{
			Search u = new Search();
			u.setdocument("123");
			this.searchmanager.save(u);
		}
	}
	
	@Test
	public void testFindAll() {
		List<Search> all = this.searchmanager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyCustomerServicername() {
		String searchname = "world";
		Search expected_search = new Search();
		// expected_Search.setdocument(document);
		Search search = this.searchmanager.findbySearchname(searchname);
		// assertEquals(Search.getdocument(), expected_Search.document());
		assertEquals(search, expected_search);
	}
}
