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
/**
 * This is a test class,Used to test the creation and query of entities
 * @ClassName FormManagerTest
 * @author LGY
 * @Time 18/7/3 14:24
 */public class FormManagerTest extends GenericGenerator{

	@Autowired
	FormManager FormManager;
	/**
	 * Used to test the insertion of entity data
	 * @funName Form
	 * @Time 18/7/3 14:25
	 */

	@Test
	public void Form()
	{
		for(int i=0;i<100;i++)
		{
			Form u=new Form();
			u.setLogo("li");
			u.setColor("yellow");
			u.setSize("x");
			u.setBuyprice("1");
			u.setSellprice("100");
			u.setEarn("99");
			this.FormManager.save(u);
		}
	}
	/**
	 * Queries for entity data
	 * @funName testFindAll
	 * @Time 18/7/3 14:26
	 */
	@Test
	public void testFindAll() {
		List<Form> all = this.FormManager.findAll();
		assertEquals(all.size(), 100);
	}
	/**
	 * Used to query against an entity's form name
	 * @funName testFindbyFormname
	 * @Time 18/7/3 14:28
	 */
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
