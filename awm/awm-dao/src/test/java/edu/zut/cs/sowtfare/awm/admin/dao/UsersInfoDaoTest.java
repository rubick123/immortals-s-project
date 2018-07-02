package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * This is a test class,used for testing user entities
 * @ClassName UserInfoDaoTest
 * @author ZLK
 * @Time 18/7/2 15:15
 */
public class UsersInfoDaoTest extends GenericDaoTestCase<Long, UserInfo, UserInfoDao> {

	@Autowired
	UserInfoDao userinfoDao;
/**
 * This is a test method
 */
	@Test
	public void testFindAll() {

		List<UserInfo> result = this.userinfoDao.findAll();

	}

}
