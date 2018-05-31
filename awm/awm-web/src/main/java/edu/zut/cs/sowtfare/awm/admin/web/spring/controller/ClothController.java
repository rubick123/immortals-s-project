package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.admin.service.ClothManager;

import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/Cloth")
public class ClothController extends GenericController<Cloth, Long, ClothManager> {
	ClothManager clothmanager;

	@Autowired
	public void setClothManager(ClothManager clothManager) {
		this.clothmanager = clothManager;
		this.manager = this.clothmanager;
	}

	@RequestMapping("/index")
	public String index() {
		return "cloth/index";
	}
}
