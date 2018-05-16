package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface ClothNumberManager extends GenericManager<ClothNumber, Long> {

	List<ClothNumber> findAll();

	ClothNumber findbyClothNumber(String ClothNumber);
}
