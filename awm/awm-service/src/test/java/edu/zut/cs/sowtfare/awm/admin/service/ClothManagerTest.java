package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;

import edu.zut.cs.sowtfare.awm.admin.domain.Group;
import edu.zut.cs.sowtfare.awm.base.service.GenericGenerator;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AdminServiceConfig.class)
public class ClothManagerTest extends GenericGenerator{

		@Autowired
		ClothManager clothManager;
		
		
		@Test
		public void insert_Cloth()
		{
			for(int i=0;i<100;i++)
			{
				Cloth u = new Cloth();
				u.setClothname("zhq");
				u.setColor("Green");
				u.setClothsize(43);
				
				this.clothManager.save(u);
			}
		}

		@Test
		public void testFindAll() {
			List<Cloth> all = this.clothManager.findAll();
			assertEquals(all.size(), 100);
		}
		
		@Test
		public void testFindbyClothname() {
			String Clothname = "world";
			Cloth expected_cloth = new Cloth();
			// expected_customerServicer.setCustomerServicername(CustomerServicername);
			Cloth cloth= this.clothManager.findbyClothname(Clothname);
			// assertEquals(customerServicer.getCustomerServicername(), expected_customerServicer.CustomerServicername());
			assertEquals(cloth, expected_cloth);
		}


}

