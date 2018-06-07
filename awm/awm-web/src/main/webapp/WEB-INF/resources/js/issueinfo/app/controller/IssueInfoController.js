Ext.define('issueinfo.controller.IssueInfoController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.issueinfoController',
	stores : [ 'IssueInfoStore' ],
	models : [ 'IssueInfoModel' ],
	views : [ 'IssueInfoGrid', 'IssueInfoEdit' ],
	init : function() {
		this.control({
			'issueinfoGrid' : {
				itemdblclick : this.editUserInfo
			},
			'issueinfoEdit button[action=save]' : {
				click : this.updateUserInfo
			}
		});
	},
	editUserInfo : function(grid, record) {
		var view = Ext.widget('issueinfoEdit');
		view.down('form').loadRecord(record);
	},
	updateUserInfo : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});