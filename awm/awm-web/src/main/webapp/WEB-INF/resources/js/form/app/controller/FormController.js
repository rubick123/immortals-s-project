Ext.define('form.controller.FormInfController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.formController',
	stores : [ 'FormStore' ],
	models : [ 'FormModel' ],
	views : [ 'FormGrid', 'FormEdit' ],
	init : function() {
		this.control({
			'formGrid' : {
				itemdblclick : this.editForm
			},
			'formEdit button[action=save]' : {
				click : this.updateForm
			}
		});
	},
	editForm : function(grid, record) {
		var view = Ext.widget('formEdit');
		view.down('form').loadRecord(record);
	},
	updateForm : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});