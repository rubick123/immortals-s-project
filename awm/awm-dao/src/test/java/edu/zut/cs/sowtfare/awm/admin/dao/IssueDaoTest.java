package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * This is a test class 
 * @author Administrator
 * @ClassName IssueDaoTest
 * @Time 18/07/02 15:20
 */
public class IssueDaoTest extends GenericDaoTestCase<Long, Issue,IssueDao> {

	@Autowired
	IssueDao IssueDao;

	@Test
	public void testFindAll() {

		List<Issue> result = this.IssueDao.findAll();

	}

}

