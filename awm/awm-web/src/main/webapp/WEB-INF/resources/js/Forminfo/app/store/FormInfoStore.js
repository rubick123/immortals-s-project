var pageSize = 20;

Ext.define('Forminfo.store.FormInfoStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.ForminfoStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'Forminfo.model.FormInfoModel',
	proxy : {
		url : server_context + '/Forminfo/.json',
		type : 'ajax',
		api : {
			read : server_context + '/Forminfo/.json',
			update : server_context + '/Forminfo/.json'
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