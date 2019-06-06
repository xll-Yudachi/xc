app.service('itemcategoryService' ,function($http){	
	//根据分类ID查询商品类别
	this.findByCategoryId = function(categoryId){
		return $http.get('portal/findByCategoryId?categoryId=' + categoryId);
	}
	
	//查询所有父级目录对应的子级目录
	this.findAllSub = function(){
		return $http.get('portal/findAllSub');
	}
	
});