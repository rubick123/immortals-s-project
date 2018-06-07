Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'Forminfo',
	appFolder : server_context + '/resources/js/Forminfo/app',
	controllers : [ 'FormInfoController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'ForminfoGrid'
			} ]
		});
	}
});
