package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.FormDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.admin.service.FormManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;
/**
 * This is an implementation class for a form entity
 * @ClassName FormManagerImpl
 * @author LGY
 * @Time 18/7/3 14:30
 */
@Component
public class FormManagerImpl extends GenericManagerImpl<Form, Long> implements FormManager {

	FormDao FormDao;
	/**
	 * Create user entities
	 * @param FormDao
	 * @Time 18/7/3 14:31
	 */
	@Autowired
	public void setUserDao(FormDao FormDao) {
		this.FormDao = FormDao;
		this.dao = this.FormDao;
	}
	/**
	 * Match the query
	 * @return result
	 * @Time 18/7/3 14:32
	 */
	@Override
	public Form findbyFormname(String Formname) {
		// TODO Auto-generated method stub
		return null;
	}

}
