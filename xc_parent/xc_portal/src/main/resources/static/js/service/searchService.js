app.service('searchService' ,function($http){	
	
	//查询所有商品
	this.findByKey = function(key,page){
		return $http.get('/portal/search/'+ key +'/' + page +  '/16');
	}
	
	
});