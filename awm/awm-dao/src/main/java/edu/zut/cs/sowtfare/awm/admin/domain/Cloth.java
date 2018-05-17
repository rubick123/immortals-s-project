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
    int clothnumber;
	
	@Column(name="clothsize")
	int clothsize;
	
	@Column(name="color")
	String color;
	
	
	@Column(name="price")
	int price;
	
	@Column(name="season")
	String season;
	
	@Column(name="num")
	int num;
	
	
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

	public int getClothnumber() {
		return clothnumber;
	}

	public void setClothnumber(int clothnumber) {
		this.clothnumber = clothnumber;
	}

	public int getClothsize() {
		return clothsize;
	}

	public void setClothsize(int clothsize) {
		this.clothsize = clothsize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}