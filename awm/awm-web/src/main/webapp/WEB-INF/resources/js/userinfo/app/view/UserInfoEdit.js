Ext.define('userinfo.view.UserInfoEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.userinfoEdit',
	title : '编辑用户相关信息',
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
				name : 'tel',
				fieldLabel : '电话'
			}, {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '用户名'
			}, {
				xtype : 'textfield',
				name : 'address',
				fieldLabel : '地址'
			}, {
				xtype : 'textfield',
				name : 'password',
				fieldLabel : '密码'
			}, {
				xtype : 'textfield',
				name : 'email',
				fieldLabel : '邮箱'
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
