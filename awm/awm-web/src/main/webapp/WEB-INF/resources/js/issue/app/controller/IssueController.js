Ext.define('issue.controller.IssueController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.issueController',
	stores : [ 'IssueStore' ],
	models : [ 'IssueModel' ],
	views : [ 'IssueGrid', 'IssueEdit' ],
	init : function() {
		this.control({
			'issueGrid' : {
				itemdblclick : this.editIssue
			},
			'issueEdit button[action=save]' : {
				click : this.updateIssue
			}
		});
	},
	editIssue : function(grid, record) {
		var view = Ext.widget('issueEdit');
		view.down('form').loadRecord(record);
	},
	updateIssue : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});