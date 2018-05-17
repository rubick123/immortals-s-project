package edu.zut.cs.sowtfare.awm.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Group;
import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.domain.User;
import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

	@Autowired
	GroupManager groupManager;

	@Autowired
	UserManager userManager;

	@Autowired
	RoleManager roleManager;
	
	@Autowired
	IssueManger issueManager;

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
				this.gen_user(g);
			}
		}
	}

	public void gen_user(Group g) {
		for (int i = 0; i < 10; i++) {
			User u = new User();
			u.setUsername("username_" + i);
			u.setPassword("password_" + i);
			u.setGroup(g);
			this.userManager.save(u);
		}
	}


	@Test
	public void gen_group1() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_issue(g);
			}
		}
	}

	public void gen_issue(Group g) {
		for (int i = 0; i < 10; i++) {
			Issue u = new Issue();
			u.setIssuename("username_" + i);
			u.setphone("123456");
			u.setGroup(g);
			this.issueManager.save(u);
		}
	}
	public void gen_Issue() {
		for (int i = 0; i < 100; i++) {
			Issue u = new Issue();
			u.setIssuename("username_" + i);
			u.setphone("123456");
			this.issueManager.save(u);
		
	}
	}
	
}
