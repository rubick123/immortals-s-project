package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class IssueManagerTest extends GenericGenerator{

	@Autowired
	IssueManager IssueManager;
	
	@Test
	public void insert_Issue()
	{
		for(int i=0;i<100;i++)
		{
			Issue u = new Issue();
			u.setphone("lph");
			u.setIssuename("boss");
			u.setEmail("1780954741@qq.com");		
			this.IssueManager.save(u);
		}
	}
	
	@Test
	public void testFindAll() {
		List<Issue> all = this.IssueManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyIssuename() {
		String issuename = "world";
		Issue expected_issue = new Issue();
		// expected_user.setUsername(username);
		Issue Issue = this.IssueManager.findbyIssuename(issuename);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(Issue, expected_issue);
	}

}