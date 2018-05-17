package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.User;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class UserManagerTest extends GenericGenerator{

	@Autowired
	UserManager userManager;
	
	@Test
	public void gen_user() {
		for (int i = 0; i < 100; i++) {
			User u = new User();
			u.setUsername("xiaoming");
			u.setEmail("123@163.com");
			this.userManager.save(u);
		}
	}

	@Test
	public void testFindAll() {
		List<User> all = this.userManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		User expected_user = new User();
		 //expected_user.setUsername(username);
		User user = this.userManager.findbyUsername(username);
		 //assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}

}
