app.controller('sellerCenterController',function($scope,sellerCenterService,$http,$location){
	
	$scope.enc = $location.search()['enc'];
	$scope.level = $location.search()['level'];
	$scope.shopEntity = {};
	$scope.searchKey = "";
	$scope.findSellerByEnc = function(){
		sellerCenterService.findSellerByEnc($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.seller = response.data;
					$scope.seller.create_time = getNowFormatDate($scope.seller.create_time);
				}
			}
		);
	}
	
	$scope.findItemBySellerId = function(){
		sellerCenterService.findItemBySellerId($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.itemList = response.data.rows;
					$scope.searchItemList = response.data.rows;
				}
			}
		);
	}
	
	$scope.findShopBySellerId = function(){
		sellerCenterService.findShopBySellerId($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.shopList = response.data.rows;
				}
			}
		);
	}
	
	
	
	$scope.addShop = function(){
		sellerCenterService.addShop($scope.shopEntity,$scope.enc).success(
			function(response){
				if(response.flag){
					alert(response.message);
					$scope.shopEntity = {};
					window.location.reload(true);
				}
			}
		);
	}
	
	$scope.searchByKeyWord = function(){
		sellerCenterService.searchByKeyWord($scope.enc,$scope.searchKey).success(
			function(response){
				if(response.flag){
					$scope.searchItemList = response.data.rows;
				}
			}	
		);
	}
	
	getNowFormatDate = function()  {//获取当前时间
		var date = new Date();
		var seperator1 = "-";
		var seperator2 = ":";
		var month = date.getMonth() + 1<10? "0"+(date.getMonth() + 1):date.getMonth() + 1;
		var strDate = date.getDate()<10? "0" + date.getDate():date.getDate();
		var currentdate = date.getFullYear() + seperator1  + month  + seperator1  + strDate
		+ " "  + date.getHours()  + seperator2  + date.getMinutes()
		+ seperator2 + date.getSeconds();
		return currentdate;
	}
 	

	renderTime = function(date) {
		var dateee = new Date(date).toJSON();
		return new Date(+new Date(dateee) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '') 
	}

	$scope.TimeEntity = {};

	$scope.Export = function(){
		sellerCenterService.Export($scope.enc,$scope.TimeEntity).success(
			function(response){
				if(response.flag){
					alert(response.message);
				}
			}
		);
	}
	
	$scope.findOrderItemByEnc = function(){
		var enc = $location.search()['enc'];
		sellerCenterService.findOrderItemByEnc(enc).success(
			function(response){
				if(response.flag){
					$scope.orderItemList = response.data;
				}
			}
		);
	}
	$scope.NoPayNum = 0;
	$scope.PayedNum = 0;
	$scope.NoDeliveryNum = 0;
	$scope.DeliveryNum = 0;
	$scope.RefundNum = 0;
	$scope.SuccessNum = 0;
	$scope.CloseNum = 0;
	$scope.findOrderByEnc = function(){
		var enc = $location.search()['enc'];
		sellerCenterService.findOrderByEnc(enc).success(
			function(response){
				if(response.flag){
					$scope.orderList = response.data;
					for(var i=0;i< $scope.orderList.length;i++){
						$scope.orderList[i].payment_time = renderTime($scope.orderList[i].payment_time);
						if($scope.orderList[i].status == '1'){
							$scope.NoPayNum ++ ;
						}else if($scope.orderList[i].status == '2'){
							$scope.PayedNum ++ ;
						}else if($scope.orderList[i].status == '3'){
							$scope.NoDeliveryNum ++ ;
						}else if($scope.orderList[i].status == '4'){
							$scope.DeliveryNum ++ ;
						}else if($scope.orderList[i].status == '5'){
							$scope.SuccessNum ++ ;
						}else if($scope.orderList[i].status == '6'){
							$scope.CloseNum ++ ;
						}else{
							$scope.RefundNum ++ ;
						}
					}
				}
			}
		);
	}
	
	$scope.findOrderMapByEnc = function(){
		sellerCenterService.findOrderMapByEnc($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.orderMap = response.data;
				}
			}
		);
	}
	
	$scope.search = function(){
		sellerCenterService.findOrderMapByEncAndKey($scope.enc,$scope.searchOrder).success(
			function(response){
				if(response.flag){
					$scope.orderMap = response.data;
				}else{
					alert(response.message);
					$scope.searchOrder="";
				}
			}
		);
	}
	
	$scope.changeStatus = function(id){
		sellerCenterService.changeStatus(id).success(
			function(response){
				if(response.flag){
					alert(response.message);
					window.location.reload(true);
				}
			}
		);
	}
}); 

