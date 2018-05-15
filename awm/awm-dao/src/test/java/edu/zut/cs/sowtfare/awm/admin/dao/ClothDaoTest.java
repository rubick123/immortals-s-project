package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;

public class ClothDaoTest extends GenericDaoTestCase<Long, Cloth, ClothDao> {

	@Autowired
	ClothDao clothDao;

	@Test
	public void testFindAll() {

		List<Cloth> result = this.clothDao.findAll();

	}

}
