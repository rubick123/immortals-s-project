Ext.define('cloth.view.ClothEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.clothEdit',
	title : '编辑服装信息',
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
				name : 'clothname',
				fieldLabel : '服装名称'
			},{
				xtype : 'textfield',
				name : 'clothnumber',
				fieldLabel : '服装数目'
			} ]
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

