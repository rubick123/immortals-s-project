package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;

@Table(name="issue")
@Entity

public class Issue extends BaseEntity {
	
	private static final long  serialVersionUID = -4376674977047164142L;
	@Column(name="Issuename")
	String Issuename;
	
	@Column(name="phone")
	String phone;
	
	@Column(name="newsname")
	String newsname;
	
	
	@Column(name="Email")
	String Email;
	
	
	
	public String getIssuename() {
		return Issuename;
	}

	public void setIssuename(String username) {
		this.Issuename = username;
	}


	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public String getnewsname() {
		return newsname;
	}

	public void setnewsname(String newsname) {
		this.newsname = newsname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void save(Issue u) {
		// TODO Auto-generated method stub
		
	}

}
