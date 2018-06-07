Ext.define('issueinfo.model.IssueInfoModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.issueinfoModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'tel',
		type : 'string',
		sortable : true
	}, {
		name : 'itemname',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
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