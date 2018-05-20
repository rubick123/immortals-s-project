package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;


public interface SearchManager extends GenericManager<Search, Long> {

	List<Search> findAll();

	Search findbySearchname(String Searchname);
}
