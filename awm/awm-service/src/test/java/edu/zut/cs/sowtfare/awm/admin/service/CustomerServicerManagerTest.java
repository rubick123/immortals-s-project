package edu.zut.cs.sowtfare.awm.admin.service;

/**
 * @author Fangjun
 * @Time 2018-6-26 13:27
 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class CustomerServicerManagerTest extends GenericGenerator{
	
	@Autowired
	CustomerServicerManager customerServicerManager;
	
	@Test
	public void insert_CustomerSevicer()
	{
		for(int i=0;i<100;i++)
		{
			CustomerServicer u = new CustomerServicer();
			u.setCustomerservicername("fj");
			u.setEmail("2545757723@qq.com");
			this.customerServicerManager.save(u);
		}
	}
	
	@Test
	public void testFindAll() {
		List<CustomerServicer> all = this.customerServicerManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyCustomerServicername() {
		String CustomerServicername = "fj123";
//		CustomerServicer expected_customerServicer = new CustomerServicer();
		// expected_customerServicer.setCustomerServicername(CustomerServicername);
		CustomerServicer customerServicer = this.customerServicerManager.findbyCustomerServicername(CustomerServicername);
		// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
		customerServicer.display();
	}

}
