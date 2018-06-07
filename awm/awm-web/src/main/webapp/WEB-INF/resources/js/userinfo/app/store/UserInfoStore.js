var pageSize = 20;

Ext.define('userinfo.store.UserInfoStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.userinfoStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'userinfo.model.UserInfoModel',
	proxy : {
		url : server_context + '/teach/userinfo/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teach/userinfo/.json',
			update : server_context + '/teach/userinfo/.json'
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