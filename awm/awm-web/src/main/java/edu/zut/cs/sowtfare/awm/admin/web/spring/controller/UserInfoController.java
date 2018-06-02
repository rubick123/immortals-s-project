package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.admin.service.UserInfoManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/teach/userinfo")
public class UserInfoController extends GenericController<UserInfo, Long, UserInfoManager>{
	
	UserInfoManager userinfoManager;
	
	@Autowired
	 public void setUserManager(UserInfoManager userinfoManager) {
        this.userinfoManager = userinfoManager;
        this.manager = this.userinfoManager;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
		String result = "/userinfo/index";
		return result;
	}
}

