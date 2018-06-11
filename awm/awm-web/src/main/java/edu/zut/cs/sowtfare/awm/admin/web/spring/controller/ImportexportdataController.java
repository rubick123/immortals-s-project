package edu.zut.cs.sowtfare.awm.admin.web.spring.controller;

import edu.zut.cs.sowtfare.awm.admin.domain.Importexportdata;
import edu.zut.cs.sowtfare.awm.admin.service.ImportexportdataManager;
import edu.zut.cs.sowtfare.awm.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/importexportdata")
public class ImportexportdataController extends GenericController<Importexportdata, Long, ImportexportdataManager>{
	
	ImportexportdataManager importexportdataManager;
	
	@Autowired
	 public void setUserManager(ImportexportdataManager importexportdataManager) {
        this.importexportdataManager = importexportdataManager;
        this.manager = this.importexportdataManager;
    }

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
        String result="importexportdata/index";
        return result;
    }
}
