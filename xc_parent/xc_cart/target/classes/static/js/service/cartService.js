app.service('cartService' ,function($http){	
	this.showCart = function(enc){
		return $http.get('/cart/showCartList/' + enc);
	}
	this.getUserId = function(enc){
		return $http.get('/cart/info/' + enc);
	}
	
	this.addItemToCartList = function(enc,id,num){
		return $http.get('/cart/addItemToCartList/' + enc + '/' + id + '/' + num);
	}
});