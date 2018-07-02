package edu.zut.cs.sowtfare.awm.admin.dao;
/**
 * Class: ClothDaoTest
 * @author ZhangHongQuan
 * method:
 * 		  testFindAll()
 */
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;
/**
 * This is a test class 
 * @author Administrator
 * @ClassName ClothDaoTest
 * @Time 18/07/02 15:33
 */
public class ClothDaoTest extends GenericDaoTestCase<Long, Cloth, ClothDao> {

	@Autowired
	ClothDao clothDao;

	@Test
	/**
	 * using for test
	 * method testFindAll()
	 */
	public void testFindAll() {

		List<Cloth> result = this.clothDao.findAll();

	}

}
