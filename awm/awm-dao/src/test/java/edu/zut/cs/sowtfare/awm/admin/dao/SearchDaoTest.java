package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * This is a test class,used for testing user entities
 * @ClassName SearchDaoTest
 * @author LH
 * @Time 18/6/29 15:15
 */
public class SearchDaoTest extends GenericDaoTestCase<Long, Search, SearchDao> {

	@Autowired
	SearchDao searchDao;
/**
 * This is a test method
 */
	@Test
	public void testFindAll() {

		List<Search> result = this.searchDao.findAll();

	}

}