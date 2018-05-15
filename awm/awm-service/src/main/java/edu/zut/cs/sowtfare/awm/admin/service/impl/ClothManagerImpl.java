package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.ClothDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.admin.service.ClothManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;

@Component
public class ClothManagerImpl extends GenericManagerImpl<Cloth, Long> implements ClothManager {

	ClothDao clothDao;

	@Autowired
	public void setClothDao(ClothDao clothDao) {
		this.clothDao = clothDao;
		this.dao = this.clothDao;
	}

	@Override
	public Cloth findbyClothname(String clothname) {
		// TODO Auto-generated method stub
		return null;
	}

}
