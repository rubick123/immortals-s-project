package edu.zut.cs.sowtfare.awm.customer.service;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;
import edu.zut.cs.sowtfare.awm.customer.domain.Customer;

import java.util.List;

public interface CustomerManager extends GenericManager<Customer, Long> {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<CustomerServicer> findByPostcode(String postcode);

    /**
     * 
     * @param fullname
     * @return
     */
	List<Customer> findByFullname(String fullname);
}

