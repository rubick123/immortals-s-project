Ext.define('clothnumber.view.ClothNumberEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.clothnumberEdit',
	title : '编辑客服相关信息',
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
				name : 'color',
				fieldLabel : '颜色'
			} ,{
				xtype : 'textfield',
				name : 'kind',
				fieldLabel : '种类'
			},{
				xtype : 'textfield',
				name : 'num',
				fieldLabel : '数量'
			},{
				xtype : 'textfield',
				name : 'size',
				fieldLabel : '尺码'
			}]
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

