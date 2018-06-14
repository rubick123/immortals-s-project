Ext.define('importexportdata.model.ImportExportDataModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.importexportdataModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'number',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});
