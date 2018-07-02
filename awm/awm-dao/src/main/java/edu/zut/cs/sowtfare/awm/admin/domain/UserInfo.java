package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;

@Table(name="userinfo")
@Entity
/**
 * This is an entity class for materializing user data
 * @ClassName UserInfo
 * @author ZLK
 * @Time 18/7/2 15:00
 */
public class UserInfo extends BaseEntity {
	
	private static final long  serialVersionUID = -4376674977047164142L;
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="tel")
	String tel;
	

	@Column(name="address")
	String address;
	
	
	@Column(name="email")
	String email;

	/**
	 * get/set 
	 * @return
	 */
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
