package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.service.IssueManager;

import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/Issue")
public class IssueController extends GenericController<Issue, Long, IssueManager> {
	IssueManager issuemanager;

	@Autowired
	public void setIssueManager(IssueManager issueManager) {
		this.issuemanager = issueManager;
		this.manager = this.issuemanager;
	}

	@RequestMapping("/index")
	public String index() {
		return "issue/index";
	}
}

