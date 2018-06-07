package edu.zut.cs.sowtfare.awm.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.UserInfoDao;
import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.admin.service.UserInfoManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class UserInfoManagerImpl extends GenericManagerImpl<UserInfo, Long> implements UserInfoManager {

	UserInfoDao userinfoDao;

	@Autowired
	public void setUserDao(UserInfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
		this.dao = this.userinfoDao;
	}

	@Override
	public List<UserInfo> findByUsername(String username) {
		// 创建查询条件数据对象
		UserInfo queryObject = new UserInfo();
		queryObject.setUsername(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("username", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<UserInfo> ex = Example.of(queryObject, matcher);
		List<UserInfo> result = dao.findAll(ex);
		return result;
	}


}
