app.controller('searchController',function($scope,searchService,$location,userService){
	
	$scope.RawLevel = null;
	
	$scope.turntoresult = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		if(enc==null){
			alert("请先登录");
			return;
		}
		window.location.href="http://localhost:9001/searchItemList.html#?key=" + $scope.key + "&enc=" + enc +"&level=" + level;
	}
	
	$scope.reflush = function(){
		window.location.reload(true); 
	} 
	
	$scope.initPageNum = 1;
	
	$scope.findByKey = function(){
		var key = $location.search()['key'];
		searchService.findByKey(key,$scope.initPageNum).success(
			function(response){
				$scope.searchItemList = response.data.rows;
				$scope.totalPageNum = Math.floor(response.data.total / 16) + 1;
			}
		);
	}
	
	$scope.turnToNextPage = function(){
		var key = $location.search()['key'];
		if($scope.initPageNum <= $scope.totalPageNum - 1){
			$scope.initPageNum = $scope.initPageNum + 1;
		}
		searchService.findByKey(key,$scope.initPageNum).success(
			function(response){
				$scope.searchItemList = response.data.rows;
			}
		);
	}
	
	$scope.turnToPrePage = function(){
		var key = $location.search()['key'];
		if($scope.initPageNum >= 2){
			$scope.initPageNum = $scope.initPageNum - 1;
		}
		
		searchService.findByKey(key,$scope.initPageNum).success(
			function(response){
				$scope.searchItemList = response.data.rows;
			}
		);
	}
	
	$scope.initUser = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
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
}); 