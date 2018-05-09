package edu.zut.cs.sowtfare.awm.customer.service.impl;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.customer.service.CustomerManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerManagerImpl implements CustomerManager {

    @Override
    public List<CustomerServicer> findByPostcode(String postcode) {
        List<CustomerServicer> result = new ArrayList<CustomerServicer>();
        for (int i = 0; i < 10; i++) {
        	CustomerServicer u = new CustomerServicer();
            result.add(u);
        }
        return result;
    }

}