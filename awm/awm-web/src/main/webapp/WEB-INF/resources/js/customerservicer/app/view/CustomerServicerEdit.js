Ext.define('customerservicer.view.CustomerServicerEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.customerservicerEdit',
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
				name : 'email',
				fieldLabel : '邮箱'
			} ,{
				xtype : 'textfield',
				name : 'customerservicername',
				fieldLabel : '姓名'
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

