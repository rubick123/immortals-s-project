package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * 
 * @ClassName ClothNumberDaoTest
 * @author liuyice
 * @Time 18/7/4 14:40
 */
public class ClothNumberDaoTest extends GenericDaoTestCase<Long, ClothNumber, ClothNumberDao> {

	@Autowired
	ClothNumberDao clothNumberDao;

	@Test
	public void testFindAll() {
		List<ClothNumber> result = this.clothNumberDao.findAll();

	}

}
