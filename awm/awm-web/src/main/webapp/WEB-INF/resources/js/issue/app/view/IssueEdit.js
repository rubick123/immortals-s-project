Ext.define('issue.view.IssueEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.issueEdit',
	title : '编辑商品相关信息',
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
				name : 'phone',
				fieldLabel : '电话'
			}, {
				xtype : 'textfield',
				name : 'issuename',
				fieldLabel : '商品名'
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
