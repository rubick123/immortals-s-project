package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface UserInfoManager extends GenericManager<UserInfo, Long> {

	List<UserInfo> findAll();

	UserInfo findbyUsername(String Username);
}
