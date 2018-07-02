package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * 
 * @author ZLK
 *
 */
public class UsersInfoDaoTest extends GenericDaoTestCase<Long, UserInfo, UserInfoDao> {

	@Autowired
	UserInfoDao userinfoDao;

	@Test
	public void testFindAll() {

		List<UserInfo> result = this.userinfoDao.findAll();

	}

}
