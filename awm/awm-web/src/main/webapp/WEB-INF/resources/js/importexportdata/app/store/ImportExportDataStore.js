var pageSize = 20;

Ext.define('importexportdata.store.ImportExportDataStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.importexportdataStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'importexportdata.model.ImportExportDataModel',
	proxy : {
		url : server_context + '/importexportdata/.json',
		type : 'ajax',
		api : {
			read : server_context + '/importexportdata/.json',
			update : server_context + '/importexportdata/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});	
