package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.SearchDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.admin.service.SearchManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class SearchManagerImpl extends GenericManagerImpl<Search, Long> implements SearchManager {

	SearchDao searchDao;

	@Autowired
	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
		this.dao = this.searchDao;
	}

	@Override
	public Search findbySearchname(String searchname) {
		// TODO Auto-generated method stub
		return null;
	}

}