Ext.define('search.model.SearchModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.searchModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'document',
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