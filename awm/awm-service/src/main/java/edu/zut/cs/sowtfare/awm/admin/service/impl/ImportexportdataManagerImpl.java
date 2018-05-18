package edu.zut.cs.sowtfare.awm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.sowtfare.awm.admin.service.ImportexportdataManager;
import edu.zut.cs.sowtfare.awm.base.service.impl.GenericManagerImpl;
import edu.zut.cs.sowtfare.awm.admin.dao.ImportexportdataDao;
import edu.zut.cs.sowtfare.awm.admin.domain.Importexportdata;

@Component
public class ImportexportdataManagerImpl extends GenericManagerImpl<Importexportdata, Long> implements ImportexportdataManager {
	
	ImportexportdataDao importexportdatarDao;
	
	@Autowired
	public void setCustomerServicerDao(ImportexportdataDao importexportdatarDao) {
		this.importexportdatarDao = importexportdatarDao;
		this.dao = this.importexportdatarDao;
	}

	@Override
	public Importexportdata findbyImportexportdataname(String Importexportdataname) {
		// TODO Auto-generated method stub
		return null;
	}
}