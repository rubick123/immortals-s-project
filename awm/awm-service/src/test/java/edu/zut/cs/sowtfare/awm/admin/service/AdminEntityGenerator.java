package edu.zut.cs.sowtfare.awm.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.User;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.domain.User;
import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

//	@Autowired
//	GroupManager groupManager;

	@Autowired

	UserManager userManager;
	/*	
	@Autowired
	RoleManager roleManager;



	@Test
	public void gen_group() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
			}
		}
	}


	public void gen_user() {
		for (int i = 0; i < 100; i++) {
			User u = new User();
			u.setUsername("xiaoming");
			u.setEmail("123@163.com");
			this.userManager.save(u);
	}
	}
*/

}
