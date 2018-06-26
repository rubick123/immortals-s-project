package edu.zut.cs.sowtfare.awm.admin.dao;
/**
 * @author Fangjun
 * 		  
 */

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.sowtfare.awm.admin.domain.CustomerServicer;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDao;
public interface CustomerServicerDao extends GenericDao<CustomerServicer, Long> {
	@Query("select cs from CustomerServicer cs where cs.customerservicername = ?1")
	/**
	 * @param customerservicername
	 * @return CustomerServicer
	 */
	CustomerServicer findbyCustomerServicername(String customerservicername);
}
