package edu.zut.cs.sowtfare.awm.admin.service;

/**
 * Interface: CustomerServicerManager
 * @author Fangjun
 * method:
 * 		   findAll() query all
 * 		   findbyCustomerServicername() query by CustomerServicername
 */
import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface CustomerServicerManager extends GenericManager<CustomerServicer, Long>{
	
	List<CustomerServicer> findAll();
	
	CustomerServicer findbyCustomerServicername(String CustomerServicername);
}

