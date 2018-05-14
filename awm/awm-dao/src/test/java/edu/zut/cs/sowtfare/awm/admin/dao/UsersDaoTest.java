package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.User;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;

public class UsersDaoTest extends GenericDaoTestCase<Long, User, UserDao> {

	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {

		List<User> result = this.userDao.findAll();

	}

}
