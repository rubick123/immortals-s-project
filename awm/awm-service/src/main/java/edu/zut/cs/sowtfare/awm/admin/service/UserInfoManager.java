package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;
import edu.zut.cs.sowtfare.awm.admin.domain.UserInfo;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;
/**
 * This is an interface,There are two methods, findAll() and findByUsername
 * @ClassName UserInfoManager
 * @author ZLK
 * @Time 18/7/2 15:50
 */
public interface UserInfoManager extends GenericManager<UserInfo, Long> {

	List<UserInfo> findAll();

	List<UserInfo> findByUsername(String username);
}
