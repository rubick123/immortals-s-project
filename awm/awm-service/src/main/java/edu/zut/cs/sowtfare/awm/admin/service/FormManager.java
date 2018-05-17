package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface FormManager extends GenericManager<Form, Long> {

	List<Form> findAll();

	Form findbyFormname(String Formname);
}
