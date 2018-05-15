package edu.zut.cs.sowtfare.awm.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class ClothManagerTest {

	@Autowired
	ClothManager clothManager;

	@Test
	public void testFindAll() {
		List<Cloth> all = this.clothManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyClothname() {
		String clothname = "world";
		Cloth expected_cloth = new Cloth();
		// expected_cloth.setClothname(clothname);
		Cloth cloth = this.clothManager.findbyClothname(clothname);
		// assertEquals(cloth.getClothname(), expected_cloth.getClothname());
		assertEquals(cloth, expected_cloth);
	}

}
