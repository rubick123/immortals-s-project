Ext.define('importexportdata.controller.ImportExportDataController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.importexportdataController',
	stores : [ 'ImportExportDataStore' ],
	models : [ 'ImportExportDataModel' ],
	views : [ 'ImportExportDataGrid', 'ImportExportDataEdit' ],
	init : function() {
		this.control({
			'importexportdataGrid' : {
				itemdblclick : this.editImportExportData
			},
			'importexportdataEdit button[action=save]' : {
				click : this.updateImportExportData
			}
		});
	},
	editImportExportData : function(grid, record) {
		var view = Ext.widget('importexportdataEdit');
		view.down('form').loadRecord(record);
	},
	updateImportExportData : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
