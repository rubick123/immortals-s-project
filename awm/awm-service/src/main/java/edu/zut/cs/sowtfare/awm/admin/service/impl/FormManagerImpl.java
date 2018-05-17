package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.FormDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.admin.service.FormManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class FormManagerImpl extends GenericManagerImpl<Form, Long> implements FormManager {

	FormDao FormDao;

	@Autowired
	public void setUserDao(FormDao FormDao) {
		this.FormDao = FormDao;
		this.dao = this.FormDao;
	}

	@Override
	public Form findbyFormname(String Formname) {
		// TODO Auto-generated method stub
		return null;
	}

}
