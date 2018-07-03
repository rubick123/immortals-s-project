package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;
/**
 * This is an interface,There are two methods, findAll() and findByFormname
 * @ClassName FormManager
 * @author LGY
 * @Time 18/7/3 14:29
 */
public interface FormManager extends GenericManager<Form, Long> {

	List<Form> findAll();

	Form findbyFormname(String Formname);
}
