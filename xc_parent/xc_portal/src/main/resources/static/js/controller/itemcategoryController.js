app.controller('itemcategoryController',function($scope,itemcategoryService,$location){
	
	$scope.findByCategoryId=function(categoryId){
		//查找一级目录
		itemcategoryService.findByCategoryId(categoryId).success(
			function(response){
				$scope.list = response.data;
			}
		);		
	}
	
	$scope.CategorySubList=[];
	
	$scope.findAllSub = function(){
		itemcategoryService.findAllSub().success(
			function(response){
				$scope.submap = response.data;
				for (var key in $scope.submap) {  
					$scope.CategorySubList[parseInt(key)] = $scope.submap[key];  
		        }
			}
		);
	}
}); 