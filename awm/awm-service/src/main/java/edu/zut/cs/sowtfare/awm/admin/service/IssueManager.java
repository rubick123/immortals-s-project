package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface IssueManager extends GenericManager<Issue, Long> {

	List<Issue> findAll();

	Issue findbyIssuename(String username);
}