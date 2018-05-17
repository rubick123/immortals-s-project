package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Importexportdata;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class ImportexportdataManagerTest extends GenericGenerator{
	
	@Autowired
	ImportexportdataManager importexportdataManager;
	
	@Test
	public void insert_Importexportdata()
	{
		for(int i=0;i<100;i++)
		{
			Importexportdata im = new Importexportdata();
			im.setNumber("147463754");
			this.importexportdataManager.save(im);
		}
	}
	
	@Test
	public void testFindAll() {
		List<Importexportdata> all = this.importexportdataManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindbyCustomerServicername() {
		String Importexportdataname = "world";
		Importexportdata expected_importexportdata = new Importexportdata();
		// expected_customerServicer.setCustomerServicername(CustomerServicername);
		Importexportdata importexportdata = this.importexportdataManager.findbyImportexportdataname(Importexportdataname);
		// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
		assertEquals(importexportdata, expected_importexportdata);
	}

}
