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

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class UserInfoManagerTest extends GenericGenerator{

	@Autowired
	UserInfoManager userinfoManager;
	
	@Test
	public void gen_user() {
		for (int i = 0; i < 100; i++) {
			UserInfo u = new UserInfo();
			u.setUsername("xixi");
			u.setEmail("123@163.com");
			u.setNickname("lala");
			u.setPassword("123456");
			u.setTel("10086");
			this.userinfoManager.save(u);
		}
	}

	@Test
	public void testFindAll() {
		List<UserInfo> all = this.userinfoManager.findAll();
		assertEquals(all.size(), 200);
	}

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
