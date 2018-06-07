Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'search',
	appFolder : server_context + '/resources/js/search/app',
	controllers : [ 'SearchController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'searchGrid'
			} ]
		});
	}
});
