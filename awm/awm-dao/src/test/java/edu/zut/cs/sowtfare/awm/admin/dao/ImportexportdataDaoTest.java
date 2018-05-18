package edu.zut.cs.sowtfare.awm.admin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Importexportdata;
import edu.zut.cs.sowtfare.awm.base.dao.DaoConfig;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = DaoConfig.class)
class ImportexportdataDaoTest {

	@Autowired
	ImportexportdataDao importexportdataDao;

	@Test
	void test() {
		String importexportdataname = "world";
		Importexportdata query = new Importexportdata();
		// List<User> result = this.userDao.findOne(null);

		Importexportdata expectedUser = new Importexportdata();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}