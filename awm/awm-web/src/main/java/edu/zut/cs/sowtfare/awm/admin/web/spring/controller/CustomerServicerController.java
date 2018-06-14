package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

/**
 * Class: CustomerServicerController
 * @author Fangjun
 * property:
 * 			customerServicerManager
 * method:
 * 			index() Specify the url returned
 * 			setUserManager() Initializing customerServicerManager variable
 */
import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.admin.service. CustomerServicerManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customerservicer")
public class CustomerServicerController extends GenericController<CustomerServicer, Long, CustomerServicerManager> {

    CustomerServicerManager customerServicerManager;
    
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/customerservicer/index";
		return result;
	}

    @Autowired
    public void setUserManager(CustomerServicerManager customerServicerManager) {
        this. customerServicerManager = customerServicerManager;
        this.manager = this. customerServicerManager;
    }
    
}
