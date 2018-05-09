package edu.zut.cs.sowtfare.awm.customer.service;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;

import java.util.List;

public interface CustomerManager {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<CustomerServicer> findByPostcode(String postcode);
}
