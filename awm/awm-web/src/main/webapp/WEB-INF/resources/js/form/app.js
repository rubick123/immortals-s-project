Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'form',
	appFolder : server_context + '/resources/js/form/app',
	controllers : [ 'FormController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'formGrid'
			} ]
		});
	}
});

