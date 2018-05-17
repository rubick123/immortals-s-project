
package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.admin.domain.Group;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class  IssueManagerTest extends GenericGenerator{

		@Autowired
		IssueManger issueManager;
     

		@Test
		public void testFindAll() {
			List<Issue> all = this.issueManager.findAll();
			assertEquals(all.size(), 100);
		}
		
		@Test
		public void testFindbyCustomerServicername() {
			String Issuename = "world";
			Issue expected_Issue = new Issue();
			// expected_customerServicer.setCustomerServicername(CustomerServicername);
			Issue Issue = this.issueManager.findbyUsername(Issuename);
			// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
			assertEquals(Issue, expected_Issue);
		}
}
