package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.domain.Search;
import edu.zut.cs.sowtfare.awm.admin.service.SearchManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class SearchManagerImpl extends GenericManagerImpl<Search, Long> implements SearchManager {

}