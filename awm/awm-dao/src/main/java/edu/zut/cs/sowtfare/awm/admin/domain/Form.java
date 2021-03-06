package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;

@Table(name="Form")
@Entity
/**
 * This is an entity class for materializing Form data
 * @ClassName Form
 * @author LGY
 * @Time 18/7/3 14:22
 */

public class Form extends BaseEntity {
	
	private static final long  serialVersionUID = -4376674977047164142L;
	@Column(name="logo")
	String logo;
	
	@Column(name="color")
	String color;
	
	@Column(name="size")
	String size;
	
	@Column(name="buyprice")
	String buyprice;
	
	
	@Column(name="sellprice")
	String sellprice;
	
	@Column(name="earn")
	String earn;
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(String buyprice) {
		this.buyprice = buyprice;
	}

	public String getSellprice() {
		return sellprice;
	}

	public void setSellprice(String sellprice) {
		this.sellprice = sellprice;
	}

	public String getEarn() {
		return earn;
	}

	public void setEarn(String earn) {
		this.earn = earn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}