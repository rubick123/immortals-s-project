package edu.zut.cs.sowtfare.awm.customer.service;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.admin.service.AdminServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class CustomerManagerTest {

    @Autowired
    CustomerManager customerManager;

    @Test
    public void testFindByPostcode() {
        String postcode = "NR74DU";
        List<CustomerServicer> result = this.customerManager.findByPostcode(postcode);
        List<CustomerServicer> expected = new ArrayList<CustomerServicer>();
        for (int i = 0; i < 10; i++) {
        	CustomerServicer u = new CustomerServicer();
            expected.add(u);
        }
        assertEquals(expected.size(), result.size());

    }

}
