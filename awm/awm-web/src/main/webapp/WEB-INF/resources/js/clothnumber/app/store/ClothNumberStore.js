var pageSize = 20;

Ext.define('cloth_number.store.UserInfoStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.clothnumberStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'clothnumberinfo.model.ClothNumberModel',
	proxy : {
		url : server_context + '/clothnumber/.json',
		type : 'ajax',
		api : {
			read : server_context + '/clothnumber/.json',
			update : server_context + '/clothnumber/.json'
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