app.controller('cartController',function($scope,cartService,$location){

	$scope.total = 0;
	$scope.num = 0;
	$scope.showCart = function(){
		var enc = $location.search()['enc'];
		cartService.showCart(enc).success(
			function(response){
				$scope.cartList = response.data;
				for(var i=0;i<$scope.cartList.length;i++){
					$scope.total += $scope.cartList[i].totalMoney;
					$scope.num += $scope.cartList[i].num;
				}
			}	
		);
	}
	getTokenFromUrl = function(){
		var url = $location.absUrl();
		var arr = url.split("/");
		$scope.itemId = arr[6]
		$scope.currentToken = arr[7];
	}
	
	$scope.turnToPayPage = function(){
		var enc = $location.search()['enc'];
		cartService.getUserId(enc).success(
			function(response){
				if(response){
					var userId = response.data;
					window.location.href="http://localhost:9000/gotoPagePay.html#?enc=" + enc +"&id=" + userId;
				}
			}	
		);
		
	}
	
	$scope.addItemToCartList = function(){
		alert(1);
		getTokenFromUrl();
		cartService.addItemToCartList($scope.currentToken,$scope.itemId,$scope.num).success(
				function(response){
					if(response.flag){
						alert(1);
						//alert(response.message);
					}
				}	
		);
	}
}); 

