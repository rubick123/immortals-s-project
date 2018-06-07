Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'issue',
	appFolder : server_context + '/resources/js/issue/app',
	controllers : [ 'IssueController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'issueGrid'
			} ]
		});
	}
});