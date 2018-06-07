var pageSize = 20;

Ext.define('cloth.store.ClothStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.clothStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'cloth.model.ClothModel',
	proxy : {
		url : server_context + '/cloth/.json',
		type : 'ajax',
		api : {
			read : server_context + '/cloth/.json',
			update : server_context + '/cloth/.json'
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
