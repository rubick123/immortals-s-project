package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class FormManagerTest extends GenericGenerator{

	@Autowired
	FormManager FormManager;

	@Test
	public void testFindAll() {
		List<Form> all = this.FormManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyFormname() {
		String username = "world";
		Form expected_user = new Form();
		// expected_user.setUsername(username);
		Form Form = this.FormManager.findbyFormname(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(Form, expected_user);
	}

}
