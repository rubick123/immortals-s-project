Ext.Loader.setConfig({
	enabled : true
});
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
