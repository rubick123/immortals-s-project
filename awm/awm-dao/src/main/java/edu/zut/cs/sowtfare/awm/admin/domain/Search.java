package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;
import edu.zut.cs.sowtfare.awm.admin.domain.Group;

@Table(name = "T_Search")
@Entity
public class Search extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "document")
	String document;

	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

	public String getUsername() {
		return document;
	}

	public void setUsername(String document) {
		this.document = document;
	}
}
