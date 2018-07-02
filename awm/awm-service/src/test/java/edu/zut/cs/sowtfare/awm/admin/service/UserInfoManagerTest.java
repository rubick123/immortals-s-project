package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

/**
 * This is a test class,Used to test the creation and query of entities
 * @ClassName UserInfoManagerTest
 * @author ZLK
 * @Time 18/7/2 16:05
 */
public class UserInfoManagerTest extends GenericGenerator{

	@Autowired
	UserInfoManager userinfoManager;
	/**
	 * Used to test the insertion of entity data
	 * @funName gen_user
	 * @Time 18/7/2 16:05
	 */
	@Test
	public void gen_user() {
		for (int i = 0; i < 100; i++) {
			UserInfo u = new UserInfo();
			u.setUsername("xixi");
			u.setEmail("123@163.com");
			u.setAddress("lala");
			u.setPassword("123456");
			u.setTel("10086");
			this.userinfoManager.save(u);
		}
	}
/**
 * Queries for entity data
 * @funName testFindAll
 * @Time 18/7/2 16:05
 */
	@Test
	public void testFindAll() {
		List<UserInfo> all = this.userinfoManager.findAll();
		assertEquals(all.size(), 200);
	}
/**
 * Used to query against an entity's user name
 * @funName testFindbyUsername
 * @Time 18/7/2 16:05
 */
	@Test
	public void testFindbyUsername() {
		String username = "xixi";
		UserInfo expected_user = new UserInfo();
		 //expected_user.setUsername(username);
		List<UserInfo> user = this.userinfoManager.findByUsername(username);
		 //assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}

}
