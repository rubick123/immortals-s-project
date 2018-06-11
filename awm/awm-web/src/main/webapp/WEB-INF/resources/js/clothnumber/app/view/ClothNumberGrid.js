var pageSize = 20;

var clothnumberStore = Ext.create('clothnumber.store.ClothNumberStore');

Ext.define('clothnumber.view.ClothNumberGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.clothnumberGrid',
	title : '服装统计',
	store : clothnumberStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "种类",
		width : 120,
		sortable : true,
		dataIndex : 'kind'
	}, {
		text : "颜色",
		width : 80,
		sortable : true,
		dataIndex : 'color'
	}, {
		text : "尺码",
		width : 80,
		sortable : true,
		dataIndex : 'size'
	}, {
		text : " 序号",
		width : 80,
		sortable : true,
		dataIndex : 'num'
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
		store : clothnumberStore,
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
