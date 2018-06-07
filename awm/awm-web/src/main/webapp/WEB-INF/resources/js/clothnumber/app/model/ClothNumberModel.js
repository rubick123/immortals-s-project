Ext.define('cloth_number.model.ClothNumberModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.clothnumberModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'color',
		type : 'string',
		sortable : true
	}, {
		name : 'kind',
		type : 'string',
		sortable : true
	}, {
		name : 'num',
		type : 'int',
		sortable : true
	}, {
		name : 'size',
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