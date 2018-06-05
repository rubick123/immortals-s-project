Ext.define('customerservicer.controller.CustomerServicerController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.customerservicerController',
	stores : [ 'CustomerServicerStore' ],
	models : [ 'CustomerServicerModel' ],
	views : [ 'CustomerServicerGrid', 'CustomerServicerEdit' ],
	init : function() {
		this.control({
			'customerservicerGrid' : {
				itemdblclick : this.editCustomerServicer
			},
			'customerservicerEdit button[action=save]' : {
				click : this.updateCustomerServicer
			}
		});
	},
	editCustomerServicer : function(grid, record) {
		var view = Ext.widget('customerservicerEdit');
		view.down('form').loadRecord(record);
	},
	updateCustomerServicer : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
