package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import edu.zut.cs.sowtfare.awm.admin.domain.Form;
import edu.zut.cs.sowtfare.awm.admin.service.FormManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Form")
public class FormController extends GenericController<Form, Long, FormManager>{
	
	FormManager FormManager;
	
	@Autowired
	 public void setUserManager(FormManager clothnumberManager) {
        this.FormManager = FormManager;
        this.manager = this.FormManager;
    }

    @RequestMapping("/index")
    public String index() {
        return "Form/index";
    }
}