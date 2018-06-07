var pageSize = 20;

Ext.define('search.store.SearchStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.searchStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'search.model.SearchModel',
	proxy : {
		url : server_context + '/search/.json',
		type : 'ajax',
		api : {
			read : server_context + '/search/.json',
			update : server_context + '/search/.json'
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