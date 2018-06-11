Ext.define('issue.model.IssueModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.issueModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'phone',
		type : 'string',
		sortable : true
	}, {
		name : 'Issuemname',
		type : 'string',
		sortable : true
	}, {
		name : 'Email',
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