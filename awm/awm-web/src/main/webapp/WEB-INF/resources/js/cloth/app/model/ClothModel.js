Ext.define('cloth.model.ClothModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.clothModel',
			fields : [{
						name : 'id',
						type : 'int',
						sortable : true
					}, {
						name : 'clothname',
						type : 'string',
						sortable : true
					}, {
						name : 'clothnumber',
						type : 'int',
						sortable : true
					}, {
						name : 'clothsize',
						type : 'int',
						sortable : true
					}, {
						name : 'color',
						type : 'string',
						sortable : true
					}, {
						name : 'price',
						type : 'int',
						sortable : true
					}, {
						name : 'dateCreated',
						type : 'date',
						dateFormat : 'time',
						sortable : true
					}, {
						name : 'dateModified',
						type : 'date',
						dateFormat : 'time',
						sortable : true
					}]
		});