package edu.zut.cs.sowtfare.awm.module.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.module.domain.Module;

public interface MudoleManager {

	List<Module> findByName(String module_name);
}