app.service('goodsService' ,function($http){	
	
	//查询所有商品
	this.findAllGoods = function(){
		return $http.get('portal/goods/findAll');
	}
	
	//分页查询一级目录商品
	this.findCategory1GoodsByPage = function(category1_id){
		return $http.get('portal/goods/findByCategory1WithPage/' + category1_id);
	}
});