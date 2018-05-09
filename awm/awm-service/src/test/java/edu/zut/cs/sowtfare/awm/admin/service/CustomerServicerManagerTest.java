package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.service.AdminServiceConfig;
import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class CustomerServicerManagerTest {
	
	@Autowired
	CustomerServicerManager customerServicerManager;
	
	@Test
	public void testFindAll() {
		List<CustomerServicer> all = this.customerServicerManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyCustomerServicername() {
		String CustomerServicername = "world";
		CustomerServicer expected_customerServicer = new CustomerServicer();
		// expected_customerServicer.setCustomerServicername(CustomerServicername);
		CustomerServicer customerServicer = this.customerServicerManager.findbyCustomerServicername(CustomerServicername);
		// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
		assertEquals(customerServicer, expected_customerServicer);
	}

}
