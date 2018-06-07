var pageSize = 20;

Ext.define('issueinfo.store.IssueInfoStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.issueinfoStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'issueinfo.model.IssueInfoModel',
	proxy : {
		url : server_context + '/teach/issueinfo/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teach/issueinfo/.json',
			update : server_context + '/teach/issueinfo/.json'
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