package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;
/**
 * using for find IssueName
 * @interface IssueManager
 * @author lipenghui
 * @Time 18/6/27 15:50
 */
public interface IssueManager extends GenericManager<Issue, Long> {

	List<Issue> findAll();

	Issue findbyIssuename(String Issuename);
}