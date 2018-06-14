Ext.define('form.model.FormModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.formModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
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
	},{
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