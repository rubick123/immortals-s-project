Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'issueinfo',
	appFolder : server_context + '/resources/js/issueinfo/app',
	controllers : [ 'IssueInfoController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'issueinfoGrid'
			} ]
		});
	}
});