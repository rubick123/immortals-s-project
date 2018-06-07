Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'cloth',
	appFolder : server_context + '/resources/js/cloth/app',
	controllers : [ 'ClothController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'clothGrid'
			} ]
		});
	}
});
