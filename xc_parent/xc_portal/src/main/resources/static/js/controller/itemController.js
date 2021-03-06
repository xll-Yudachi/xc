app.controller('itemController',function($scope,itemService,$location){
	
	$scope.findItemByGoodsId = function(goodsId){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		if(enc==null){
			alert("请先登录");
			return;
		}
		itemService.findItemByGoodsId(goodsId).success(
			function(response){
				$scope.currentItem = response.data;
				window.open("http://localhost:9004/page/item/findItemById/" + $scope.currentItem.id +"/" + enc + "/" + level);
				
				
				
			}
		);
	}
	
	$scope.findItemById = function(id){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		window.open("http://localhost:9004/page/item/findItemById/" + id + "/" + enc + "/" + level);
		
		
	}
}); 
