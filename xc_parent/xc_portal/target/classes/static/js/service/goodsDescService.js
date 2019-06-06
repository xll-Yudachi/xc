app.service('goodsDescService' ,function($http){	
	
	//查询所有商品
	this.findAllGoodsDescByCategory2_Id = function(categoryId){
		return $http.get('portal/goodsdesc/findAllGoodsDescByCategory2_Id/' + categoryId);
	}
	
	
});