package edu.zut.cs.sowtfare.awm.admin.service.impl;
/**
 * @author LiuHao
 * @Time 2016-6-27 16:25
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.SearchDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.admin.service.SearchManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;
/**
 * This is an implementation class for a user entity
 * @ClassName SearchManagerImpl
 * @author LH
 * @Time 18/6/29 15:30
 */
@Component
public class SearchManagerImpl extends GenericManagerImpl<Search, Long> implements SearchManager {

	SearchDao searchDao;

	@Autowired
	/**
	 * 
	 * @param SearchDao
	 */
	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
		this.dao = this.searchDao;
	}
	/**
	 * @param searchname
	 */
	@Override
	public Search findbySearchname(String searchname) {
		// TODO Auto-generated method stub
		return null;
	}

}