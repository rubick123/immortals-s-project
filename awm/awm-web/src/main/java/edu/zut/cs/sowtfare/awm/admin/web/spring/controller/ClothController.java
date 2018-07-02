package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.sowtfare.awm.admin.domain.Cloth;
import edu.zut.cs.sowtfare.awm.admin.service.ClothManager;

import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/cloth")
/**
 * This is an inheritance class ,using for initialization and add method.
 * @ClassName  ClothController
 * @author ZhangHongQuan
 * @Time 2018/07/02
 */
public class ClothController extends GenericController<Cloth, Long, ClothManager> {
	ClothManager clothmanager;

	@Autowired
	/**
	 * method set() initialization index() return URL
	 * @param clothManager
	 */
	public void setClothManager(ClothManager clothManager) {
		this.clothmanager = clothManager;
		this.manager = this.clothmanager;
	}

	@RequestMapping("/index")
	public String index() {
		return "cloth/index";
	}
}
