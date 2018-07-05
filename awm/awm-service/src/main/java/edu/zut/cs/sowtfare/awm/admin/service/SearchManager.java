package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;
/**
 * This is an interface,There are two methods, findAll() and findByUsername
 * @ClassName SearchManager
 * @author LH
 * @Time 18/6/29 15:50
 */

public interface SearchManager extends GenericManager<Search, Long> {

	List<Search> findAll();

	Search findbySearchname(String Searchname);
}
