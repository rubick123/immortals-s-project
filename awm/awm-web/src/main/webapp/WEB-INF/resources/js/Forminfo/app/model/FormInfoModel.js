Ext.define('Forminfo.model.FormInfoModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.ForminfoModel',
	fields : [ {
		name : 'logo',
		type : 'string',
		sortable : true
	}, {
		name : 'color',
		type : 'string',
		sortable : true
	}, {
		name : 'size',
		type : 'string',
		sortable : true
	}, {
		name : 'buyprice',
		type : 'string',
		sortable : true
	}, {
		name : 'sellprice',
		type : 'string',
		sortable : true
	}, {
		name : 'earn',
		type : 'string',
		sortable : true
	
	} ]
});