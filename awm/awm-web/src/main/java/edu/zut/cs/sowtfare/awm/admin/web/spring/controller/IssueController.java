package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.sowtfare.awm.admin.domain.Issue;
import edu.zut.cs.sowtfare.awm.admin.service.IssueManager;

import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/issue")
/**
 * This is an inheritance class ,using for initialization and add method.
 * @ClassName  IssueController
 * @author lipenghui
 * @Time 2018/07/03
 */
public class IssueController extends GenericController<Issue, Long, IssueManager> {
	IssueManager issuemanager;

	@Autowired
	/**
	 * method set() initialization index() return URL
	 * @param issueManager
	 */
	public void setIssueManager(IssueManager issueManager) {
		this.issuemanager = issueManager;
		this.manager = this.issuemanager;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "issue/index";
		return result;
	}
}

