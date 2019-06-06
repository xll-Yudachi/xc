app.controller('cartController',function($scope,cartService,$location){
	
	$scope.addItemToCartList = function(){
		getTokenFromUrl();
		cartService.addItemToCartList($scope.currentToken,$scope.itemId,$scope.num).success(
				function(response){
					if(response.flag){
						//alert(response.message);
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
	
	$scope.turnToCartList = function(){
		getTokenFromUrl();
		window.open('http://localhost:9107/cart.html#?enc=' + $scope.currentToken);
	}
}); 

//http://localhost:9004/page/item/findItemById/1369838/eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMTMzNjM2MDIyMTc4MDE3MjgwIiwic3ViIjoi5Lmw5a625a-G56CB6ZqQ6JePIiwiaWF0IjoxNTU5Mzk2NDQzLCJyb2xlcyI6InVzZXIiLCJleHAiOjE1NTk0MDAwNDN9.01xJbYk8_N2EGtFzUrrmzHhUYNAbWhr455fBsXye_Ec/1