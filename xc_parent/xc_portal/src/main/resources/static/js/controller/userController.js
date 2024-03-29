app.controller('userController',function($scope,userService,$location){
	
	
	$scope.RawLevel = null;
	$scope.currentUser = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		$scope.enc = enc;
		$scope.level = level;
		$scope.RawLevel = level;
		userService.findUserById(level,enc).success(
			function(response){
				if(response.flag){
					if(level == '1'){
						$scope.User = response.data;
					}
					if(level == '2'){
						$scope.Seller = response.data;
					}
				}
			}
		);
	}
	
	$scope.turnToUserCenter = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		if(enc==null || enc==''){
			alert("请先登录");
		}
		if(level == '1'){
			window.open('http://localhost:9106/user.html#?enc=' + enc + "&level=" + level);
		}
		if(level == '2'){
			window.open('http://localhost:9102/seller.html#?enc= ' + enc + "&level=" + level);
		}
	}
	
}); 