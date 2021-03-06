var pageSize = 20;

var formStore = Ext.create('form.store.FormStore');

Ext.define('form.view.FormGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.formGrid',
	title : '服装盈利统计信息表',
	store : formStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : '品牌',
		width : 50,
		sortable : true,
		dataIndex : 'logo'
	}, {
		text : "颜色",
		width : 120,
		sortable : true,
		dataIndex : 'color'
	}, {
		text : "尺码",
		width : 80,
		sortable : true,
		dataIndex : 'size'
	}, {
		text : "进价",
		width : 80,
		sortable : true,
		dataIndex : 'buyprice'
	}, {
		text : " 售价",
		width : 80,
		sortable : true,
		dataIndex : 'sellprice'
	}, {
		text : "盈利",
		width : 80,
		sortable : true,
		dataIndex : 'earn'
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
		store : formStore,
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
