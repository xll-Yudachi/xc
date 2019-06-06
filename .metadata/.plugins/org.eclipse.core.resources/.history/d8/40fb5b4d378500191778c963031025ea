app.service('userService' ,function($http,$location){	
	
	this.findUserById = function(level,enc){
		var url = $location.absUrl();
		return $http.get(url + '/' + level + '/' + enc);
	}
	
	
});