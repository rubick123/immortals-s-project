package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;
import edu.zut.cs.sowtfare.awm.admin.domain.Group;

@Table(name = "ClothNumber")
@Entity
public class ClothNumber extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "kind")
	String kind;

	@Column(name = "color")
	String color;

	@Column(name = "size")
	String size;
	
	@Column(name = "num")
	String num;
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
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
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}
