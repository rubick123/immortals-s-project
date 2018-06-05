var pageSize = 20;

Ext.define('customerservicer.store.CustomerServicerStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.customerservicerStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'customerservicer.model.CustomerServicerModel',
	proxy : {
		url : server_context + '/customerservicer/.json',
		type : 'ajax',
		api : {
			read : server_context + '/customerservicer/.json',
			update : server_context + '/customerservicer/.json'
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
