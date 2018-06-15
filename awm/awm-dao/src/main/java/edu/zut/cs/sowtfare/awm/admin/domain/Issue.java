package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;

@Table(name="issue")
@Entity

public class Issue extends BaseEntity {
	
	private static final long  serialVersionUID = -4376674977047164142L;
	@Column(name="issuename")
	String issuename;
	
	@Column(name="phone")
	String phone;
	
	
	
	@Column(name="email")
	String email;
	
	
	
	public String getIssuename() {
		return issuename;
	}

	public void setIssuename(String issuename) {
		this.issuename = issuename;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void save(Issue u) {
		// TODO Auto-generated method stub
		
	}

}
