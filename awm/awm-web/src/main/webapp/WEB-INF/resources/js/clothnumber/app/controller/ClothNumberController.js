Ext.define('cloth_number.controller.ClothNumberController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.clothnumberController',
	stores : [ 'ClothNumberoStore' ],
	models : [ 'ClothNumberModel' ],
	views : [ 'ClothNumberGrid', 'ClothNumberEdit' ],
	init : function() {
		this.control({
			'clothnumberGrid' : {
				itemdblclick : this.editClothNumber
			},
			'clothnumberEdit button[action=save]' : {
				click : this.updateClothNumber
			}
		});
	},
	editClothNumber : function(grid, record) {
		var view = Ext.widget('clothnumberEdit');
		view.down('form').loadRecord(record);
	},
	updateClothNumber : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});