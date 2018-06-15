var pageSize = 20;

Ext.define('form.store.FormStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.formStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'form.model.FormModel',
	proxy : {
		url : server_context + '/form/.json',
		type : 'ajax',
		api : {
			read : server_context + '/form/.json',
			update : server_context + '/form/.json'
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