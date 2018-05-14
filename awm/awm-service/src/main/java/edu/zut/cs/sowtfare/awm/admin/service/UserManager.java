package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.User;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface UserManager extends GenericManager<User, Long> {

	List<User> findAll();

	User findbyUsername(String username);
}
