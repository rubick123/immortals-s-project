package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.sowtfare.awm.base.domain.BaseEntity;
/**
 * 
 * @author LiuHao
 * @Time 2018-6-27 16:16
 */
@Table(name = "T_Search")
@Entity
public class Search extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "document")
	String document;// the document of search

	
	

	public String getdocument() {
		return document;
	}

	public void setdocument(String document) {
		this.document = document;
	}
}
