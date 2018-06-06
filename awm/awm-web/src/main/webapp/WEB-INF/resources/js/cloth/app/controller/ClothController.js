Ext.define('cloth.controller.ClothController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.clothController',
	stores : [ 'ClothStore' ],
	models : [ 'ClothModel' ],
	views : [ 'ClothGrid', 'ClothEdit' ],
	init : function() {
		this.control({
			'clothGrid' : {
				itemdblclick : this.editCloth
			},
			'clothEdit button[action=save]' : {
				click : this.updateCloth
			}
		});
	},
	editCloth : function(grid, record) {
		var view = Ext.widget('clothEdit');
		view.down('form').loadRecord(record);
	},
	updateCloth : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});