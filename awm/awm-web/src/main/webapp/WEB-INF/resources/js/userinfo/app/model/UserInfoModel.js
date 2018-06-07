Ext.define('userinfo.model.UserInfoModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.userinfoModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'tel',
		type : 'string',
		sortable : true
	}, {
		name : 'username',
		type : 'string',
		sortable : true
	}, {
		name : 'nickname',
		type : 'string',
		sortable : true
	}, {
		name : 'password',
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