






package edu.zut.cs.sowtfare.awm.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDaoTestCase;

public class FormDaoTest extends GenericDaoTestCase<Long, Form, FormDao> {

	@Autowired
	FormDao FormDao;

	@Test
	public void testFindAll() {

		List<Form> result = this.FormDao.findAll();

	}

}