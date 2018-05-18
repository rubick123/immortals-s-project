package edu.zut.cs.sowtfare.awm.admin.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.admin.domain.Importexportdata;
import edu.zut.cs.sowtfare.awm.base.service.GenericManager;

public interface ImportexportdataManager extends GenericManager<Importexportdata, Long>{
	
	List<Importexportdata> findAll();
	
	Importexportdata findbyImportexportdataname(String Importexportdataname);
}