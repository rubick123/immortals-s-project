package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.dao.ClothNumberDao;
import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.admin.service.ClothNumberManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;
/**
 * @ClassName ClothNumberManagerImpl
 * @author liuyice
 * @Time 18/7/4 14:52
 */
@Component
public class ClothNumberManagerImpl extends GenericManagerImpl<ClothNumber, Long> implements ClothNumberManager{
	
	ClothNumberDao clothNumberDao;
	
	@Autowired
	/**
	 * 
	 * @param CLothNumberDao
	 */
	public void setClothNumberDao(ClothNumberDao clothNumberDao) {
		this.clothNumberDao = clothNumberDao;
		this.dao=this.clothNumberDao;
	}
	
	@Override
	/**
	 * @param ClothNumber
	 */
	public ClothNumber findbyClothNumber(String ClothNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
