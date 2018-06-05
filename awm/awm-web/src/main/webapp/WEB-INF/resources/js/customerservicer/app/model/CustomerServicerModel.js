Ext.define('customerservicer.model.CustomerServicerModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.customerservicerModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		name : 'customerservicername',
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
