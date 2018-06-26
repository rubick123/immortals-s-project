package edu.zut.cs.sowtfare.awm.admin.service;

/**
 * @author Fangjun
 * @Time 2018-6-26 13:23
 */
import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface CustomerServicerManager extends GenericManager<CustomerServicer, Long>{
	/**
	 * @param findAll
	 * @return List<CustomerServicer>
	 */
	List<CustomerServicer> findAll();
	
	/**
	 * 
	 * @param CustomerServicername
	 * @return CustomerServicer
	 */
	CustomerServicer findbyCustomerServicername(String CustomerServicername);
}

