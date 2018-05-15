package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface ClothManager extends GenericManager<Cloth, Long> {

	List<Cloth> findAll();

	Cloth findbyClothname(String clothname);
}
