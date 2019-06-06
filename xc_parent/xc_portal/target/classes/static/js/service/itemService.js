app.service('itemService' ,function($http){	
	this.findItemByGoodsId = function(goodsId){
		return $http.get('/portal/item/findItemByGoodsId/' + goodsId);
	}
});