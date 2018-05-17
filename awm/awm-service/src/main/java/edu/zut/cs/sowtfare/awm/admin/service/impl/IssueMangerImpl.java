package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.IssueDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.service.IssueManger;
import edu.zut.cs.sowtfare.awm.base.dao.GenericDao;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class IssueMangerImpl extends GenericManagerImpl<Issue, Long> implements IssueManger {

	IssueDao IssueDao;

	@Autowired
	public void setIssueDao(IssueDao IssueDao) {
		this.IssueDao =  IssueDao;
		this.dao =  this.IssueDao;
	}

	@Override
	public Issue findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}