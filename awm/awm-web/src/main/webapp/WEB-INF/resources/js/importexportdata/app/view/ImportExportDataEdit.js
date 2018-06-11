Ext.define('importexportdata.view.ImportExportDataEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.importexportdataEdit',
	title : '编辑进出口相关信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [{
				xtype : 'textfield',
				name : 'NUMBER',
				fieldLabel : '数量'
			}, ]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});

