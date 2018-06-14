Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'importexportdata',
	appFolder : server_context + '/resources/js/importexportdata/app',
	controllers : [ 'ImportExportDataController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'importexportdataGrid'
			} ]
		});
	}
});

