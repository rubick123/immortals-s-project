Ext.define('search.controller.SearchController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.searchController',
	stores : [ 'SearchStore' ],
	models : [ 'SearchModel' ],
	views : [ 'SearchGrid', 'SearchEdit' ],
	init : function() {
		this.control({
			'searchGrid' : {
				itemdblclick : this.editSearch
			},
			'searchEdit button[action=save]' : {
				click : this.updateSearch
			}
		});
	},
	editSearch : function(grid, record) {
		var view = Ext.widget('searchEdit');
		view.down('form').loadRecord(record);
	},
	updateSearch : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});