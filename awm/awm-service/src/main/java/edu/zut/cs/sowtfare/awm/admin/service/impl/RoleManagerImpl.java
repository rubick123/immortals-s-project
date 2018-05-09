package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.domain.Role;
import edu.zut.cs.sowtfare.awm.admin.service.RoleManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}