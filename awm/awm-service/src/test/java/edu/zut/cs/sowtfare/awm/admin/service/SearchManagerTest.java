package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

public class SearchManagerTest extends GenericGenerator{

	@Autowired
	SearchManager searchmanager;
	
	@Test
	public void testFindAll() {
		List<Search> all = this.searchmanager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyCustomerServicername() {
		String searchname = "world";
		Search expected_search = new Search();
		// expected_customerServicer.setCustomerServicername(CustomerServicername);
		Search search = this.searchmanager.findbySearchname(searchname);
		// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
		assertEquals(search, expected_search);
	}
}
