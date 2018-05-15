package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;
@Table (name="Cloth")
@Entity
public class Cloth extends BaseEntity {
	
	private static final long  serialVersionUID = -4376674977047164142L;
	@Column(name="clothname")
	String clothname;
	
	@Column(name="clothnumber")
	String clothnumber;
	
	@Column(name="clothsize")
	String clothsize;
	
	@Column(name="color")
	String color;
	
	
	@Column(name="price")
	String price;
	
	@Column(name="season")
	String season;
	
	@Column(name="num")
	String num;
	
	
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	Group group;
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getClothname() {
		return clothname;
	}

	public void setClothname(String clothname) {
		this.clothname = clothname;
	}

	public String getClothnumber() {
		return clothnumber;
	}

	public void setClothnumber(String clothnumber) {
		this.clothnumber = clothnumber;
	}

	public String getClothsize() {
		return clothsize;
	}

	public void setClothsize(String clothsize) {
		this.clothsize = clothsize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}