package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.admin.service. CustomerServicerManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learn/customerservicer")
public class CustomerServicerController extends GenericController<CustomerServicer, Long, CustomerServicerManager> {

    CustomerServicerManager customerServicerManager;

    @Autowired
    public void setUserManager(CustomerServicerManager customerServicerManager) {
        this. customerServicerManager = customerServicerManager;
        this.manager = this. customerServicerManager;
    }
    
}
