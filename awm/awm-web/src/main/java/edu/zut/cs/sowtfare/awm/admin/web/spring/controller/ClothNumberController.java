package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.admin.service.ClothNumberManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/clothnumber")
public class ClothNumberController extends GenericController<ClothNumber, Long, ClothNumberManager>{
	
	ClothNumberManager clothnumberManager;
	
	@Autowired
	 public void setUserManager(ClothNumberManager clothnumberManager) {
        this.clothnumberManager = clothnumberManager;
        this.manager = this.clothnumberManager;
    }

    @RequestMapping("/index")
    public String index() {
        return "clothnumber/index";
    }
}
