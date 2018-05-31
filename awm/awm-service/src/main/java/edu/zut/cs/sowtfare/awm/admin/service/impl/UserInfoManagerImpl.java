package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
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
	public UserInfo findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
