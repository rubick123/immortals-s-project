Ext.define('Forminfo.controller.FormInfoController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.ForminfoController',
	stores : [ 'FormInfoStore' ],
	models : [ 'FormInfoModel' ],
	views : [ 'FormInfoGrid', 'FormInfoEdit' ],
	init : function() {
		this.control({
			'ForminfoGrid' : {
				itemdblclick : this.editUserInfo
			},
			'ForminfoEdit button[action=save]' : {
				click : this.updateUserInfo
			}
		});
	},
	editUserInfo : function(grid, record) {
		var view = Ext.widget('ForminfoEdit');
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