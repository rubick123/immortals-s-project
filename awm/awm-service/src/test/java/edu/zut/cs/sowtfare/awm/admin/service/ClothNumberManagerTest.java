package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

/**
 * @ClassName ClothNumberManagerTest
 * @author liuyice
 * @Time 18/7/4 15:05
 */
public class ClothNumberManagerTest extends GenericGenerator{

	@Autowired
	ClothNumberManager clothNumberManager;
	
	@Test
	public void add()
	{
		List<ClothNumber> list=new ArrayList<>();
		for(int i=0;i<100;i++) 
		{
			ClothNumber clothNumber=new ClothNumber();
			clothNumber.setNum(""+i);
			clothNumber.setColor("red");
			clothNumber.setKind("shirt");
			clothNumber.setSize("xxl");
			list.add(clothNumber);
		}
		this.clothNumberManager.save(list);
	}
}