var pageSize = 20;

var userinfoStore = Ext.create('userinfo.store.UserInfoStore');

Ext.define('userinfo.view.UserInfoGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.userinfoGrid',
	title : '服装批发用户信息表',
	store : userinfoStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "电话",
		width : 120,
		sortable : true,
		dataIndex : 'tel'
	}, {
		text : "用户名",
		width : 80,
		sortable : true,
		dataIndex : 'username'
	}, {
		text : "地址",
		width : 80,
		sortable : true,
		dataIndex : 'address'
	}, {
		text : " 密码",
		width : 80,
		sortable : true,
		dataIndex : 'password'
	}, {
		text : "邮箱",
		width : 80,
		sortable : true,
		dataIndex : 'email'
	}, {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : userinfoStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
