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
		name : 'issuename',
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