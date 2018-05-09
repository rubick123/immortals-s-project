package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface CustomerServicerManager extends GenericManager<CustomerServicer, Long>{
	
	List<CustomerServicer> findAll();
	
	CustomerServicer findbyCustomerServicername(String CustomerServicername);
}

