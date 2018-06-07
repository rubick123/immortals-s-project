Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'customerservicer',
	appFolder : server_context + '/resources/js/customerservicer/app',
	controllers : [ 'CustomerServicerController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'customerservicerGrid'
			} ]
		});
	}
});

