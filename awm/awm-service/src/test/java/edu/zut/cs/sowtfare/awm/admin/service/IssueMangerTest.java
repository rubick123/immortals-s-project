package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class IssueMangerTest {

	@Autowired
	IssueManger IssueManger;

	@Test
	public void testFindAll() {
		List<Issue> all = this.IssueManger.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		Issue expected_user = new Issue();
		// expected_user.setUsername(username);
		Issue Issue = this.IssueManger.findbyUsername(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(Issue, expected_user);
	}

}