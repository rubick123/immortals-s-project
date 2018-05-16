package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.service.CustomerServicerManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;
import edu.zut.cs.sowtfare.awm.admin.dao.CustomerServicerDao;
import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;

@Component
public class CustomerServiceManagerImpl extends GenericManagerImpl<CustomerServicer, Long> implements CustomerServicerManager {
	
	CustomerServicerDao customerServicerDao;
	
	@Autowired
	public void setCustomerServicerDao(CustomerServicerDao customerServicerDao) {
		this.customerServicerDao = customerServicerDao;
		this.dao = this.customerServicerDao;
	}

	@Override
	public CustomerServicer findbyCustomerServicername(String CustomerServicername) {
		// TODO Auto-generated method stub
		return null;
	}
}
