Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'clothnumber',
	appFolder : server_context + '/resources/js/clothnumber/app',
	controllers : [ 'ClothNumberController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'clothnumberGrid'
			} ]
		});
	}
});

