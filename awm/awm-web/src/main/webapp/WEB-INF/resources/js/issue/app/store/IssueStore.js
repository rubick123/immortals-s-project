var pageSize = 20;

Ext.define('issue.store.IssueStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.issueStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'issue.model.IssueModel',
	proxy : {
		url : server_context + '/teach/issue/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teach/issue/.json',
			update : server_context + '/teach/issue/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});