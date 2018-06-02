package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.admin.service.SearchManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/search")
public class SearchController extends GenericController<Search, Long, SearchManager> {

    SearchManager searchManager;

    @Autowired
    public void setUserManager(SearchManager searchManager) {
        this.searchManager = searchManager;
        this.manager = this. searchManager;
    }

    @RequestMapping("/index")
    public String index() {
        return "search/index";
    }
}