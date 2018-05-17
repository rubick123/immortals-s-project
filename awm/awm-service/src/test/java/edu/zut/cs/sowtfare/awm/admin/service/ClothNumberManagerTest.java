package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.ClothNumber;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

public class ClothNumberManagerTest extends GenericGenerator{

	@Autowired
	ClothNumberManager ClothNumberManager;
	
	
	@Test
	public void get_ClothNumber()
	{
		for(int i=0;i<100;i++)
		{
			ClothNumber u = new ClothNumber();
			u.setKind("");
			u.setColor("");
			u.setSize("");
			u.setNum("");
			this.ClothNumberManager.save(u);
		}
	}
	
	
	
	@Test
	public void testFindAll() {
		List<ClothNumber> all = this.ClothNumberManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbykind() {
		String kind = "world";
		ClothNumber expected_clothnumber = new ClothNumber();
		// expected_customerServicer.setCustomerServicername(CustomerServicername);
		ClothNumber ClothNumber = this.ClothNumberManager.findbyClothNumber(kind);
		// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
		assertEquals(kind, expected_clothnumber);
	}
}