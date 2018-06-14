package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;

/**
 * Entity:CustomerServicer
 * @author Fangjun
 * property:
 * 			customerservicername
 * 			email
 * method:
 * 		  display() For query testing
 */
@Table(name = "T_ADMIN_CUSTOMERSERVICER")
@Entity
public class CustomerServicer extends BaseEntity{
	
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "CUSTONERSERVICERNAME")
	String customerservicername;

	@Column(name = "EMAIL")
	String email;
	
	public String getCustomerservicername() {
		return customerservicername;
	}

	public void setCustomerservicername(String customerservicername) {
		this.customerservicername = customerservicername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("customerservicername:"+customerservicername+" "+"email:"+email);
	}
}
