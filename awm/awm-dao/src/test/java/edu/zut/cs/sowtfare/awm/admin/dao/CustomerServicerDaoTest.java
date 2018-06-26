package edu.zut.cs.sowtfare.awm.admin.dao;

/**
 * @author Fangjun
 * @Time 2018-6-26 13:21
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class CustomerServicerDaoTest {

	@Autowired
	CustomerServicerDao customerServicerDao;

	@Test
	/**
	 * @param test
	 * 
	 */
	void test() {
		String customerservicername = "world";
		CustomerServicer query = new CustomerServicer();
		 //List<User> result = this.userDao.findOne(null);

		CustomerServicer expectedUser = new CustomerServicer();
//		 expectedUser.setUsername(username);
//		 assertEquals(user, expectedUser);
//		 assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}