Ext.define('Forminfo.view.FormInfoEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.ForminfoEdit',
	title : '编辑服装盈利统计信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'logo',
				fieldLabel : '品牌'
			}, {
				xtype : 'textfield',
				name : 'color',
				fieldLabel : '颜色'
			}, {
				xtype : 'textfield',
				name : 'size',
				fieldLabel : '尺码'
			}, {
				xtype : 'textfield',
				name : 'buyprice',
				fieldLabel : '进价'
			}, {
				xtype : 'textfield',
				name : 'sellprice',
				fieldLabel : '售价'
			},{
				xtype : 'textfield',
				name : 'earn',
				fieldLabel : '盈利'
			},]
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
