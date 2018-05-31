package edu.zut.cs.sowtfare.awm.customer.service.impl;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.customer.domain.Customer;
import edu.zut.cs.sowtfare.awm.customer.service.CustomerManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerManagerImpl implements CustomerManager {

    @Override
    public List<Customer> findByPostcode(String postcode) {
        List<CustomerServicer> result = new ArrayList<CustomerServicer>();
        for (int i = 0; i < 10; i++) {
        	CustomerServicer u = new CustomerServicer();
            result.add(u);
        }
        return result;
    }

	@Override
	public Page<Customer> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer save(Customer entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> save(Iterable<Customer> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findByFullname(String fullname) {
		// TODO Auto-generated method stub
		return null;
	}

}