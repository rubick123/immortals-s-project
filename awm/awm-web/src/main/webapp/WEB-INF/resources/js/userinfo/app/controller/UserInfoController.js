Ext.define('userinfo.controller.UserInfoController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.userinfoController',
	stores : [ 'UserInfoStore' ],
	models : [ 'UserInfoModel' ],
	views : [ 'UserInfoGrid', 'UserInfoEdit' ],
	init : function() {
		this.control({
			'userinfoGrid' : {
				itemdblclick : this.editUserInfo
			},
			'userinfoEdit button[action=save]' : {
				click : this.updateUserInfo
			}
		});
	},
	editUserInfo : function(grid, record) {
		var view = Ext.widget('userinfoEdit');
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