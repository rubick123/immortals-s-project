Ext.Loader.setConfig({
	enabled : true
});
//创建 应用程序的实例
Ext.application({
	name : 'userinfo',
	appFolder : server_context + '/resources/js/userinfo/app',
	controllers : [ 'UserInfoController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'userinfoGrid'
			} ]
		});
	}
});
