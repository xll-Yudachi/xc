app.service('payService' ,function($http,$location){	
	
	this.init = function(userId){
		return $http.get('/pay/cart/' + userId);
	}
	
	this.gotoPayPage = function(entity){
		return $http.post('/alipay/page/gotoPayPage',entity);
	}
	
});