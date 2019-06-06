app.controller('userCenterController',function($scope,userCenterService,$http,$location){
	
	$scope.enc = $location.search()['enc'];
	$scope.level = $location.search()['level'];
	$scope.RawLevel = null;
	$scope.currentUser = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		$scope.enc = enc;
		$scope.level = level;
		$scope.RawLevel = level;
		userCenterService.findUserById(level,enc).success(
			function(response){
				if(response.flag){
					if(level == '1'){
						$scope.User = response.data;
						$scope.User.birthday = dateChange($scope.User.birthday);
					}
					if(level == '2'){
						$scope.Seller = response.data;
					}
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
	 	
		$scope.VisitDate = getNowFormatDate();
	
	$scope.findOrderItemByEnc = function(){
		var enc = $location.search()['enc'];
		userCenterService.findOrderItemByEnc(enc).success(
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
		userCenterService.findOrderByEnc(enc).success(
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
	
	$scope.turnToUserCenter = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		window.location.href = "http://localhost:9106/user.html#?enc=" + enc + "&level=" + level;
	}
	
	$scope.turnToUserOrder = function(){
		var enc = $location.search()['enc'];
		var level = $location.search()['level'];
		window.location.href = "http://localhost:9106/user-order.html#?enc=" + enc + "&level=" + level;
	}
	
	$scope.turnToUserAddress = function(){
		window.location.href = "http://localhost:9106/user-address.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserCollection = function(){
		window.location.href = "http://localhost:9106/user-collection.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserPreorder = function(){
		window.location.href = "http://localhost:9106/user-preorder.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserLog = function(){
		window.location.href = "http://localhost:9106/user-log.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserInfo = function(){
		window.location.href = "http://localhost:9106/user-info.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserDistribution = function(){
		window.location.href = "http://localhost:9106/user-distribution.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}
	
	$scope.turnToUserAccount = function(){
		window.location.href = "http://localhost:9106/user-account.html#?enc=" + $scope.enc + "&level=" + $scope.level;
	}

	$scope.findOrderMapByEnc = function(){
		userCenterService.findOrderMapByEnc($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.orderMap = response.data;
				}
			}
		);
	}
	
	renderTime = function(date) {
		 var dateee = new Date(date).toJSON();
		 return new Date(+new Date(dateee) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '') 
	}
	
	$scope.search = function(){
		userCenterService.findOrderMapByEncAndKey($scope.enc,$scope.searchOrder).success(
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
	
	$scope.addAddress = function(userid){
		var flag = document.getElementById("checkboxID").checked;
		if(flag==true){
			$scope.addressEntity.is_default = 1;
		}else{
			$scope.addressEntity.is_default = 0;
		}
		$scope.addressEntity.user_id = userid;
		userCenterService.addAddress($scope.enc,$scope.addressEntity).success(
			function(response){
				if(response.flag){
					alert(response.message);
					$scope.addressEntity = {};
					window.location.reload(true);
				}
			}
		);
	}
	
	$scope.initAddress = function(){
		userCenterService.findAddressByEnc($scope.enc).success(
			function(response){
				if(response.flag){
					$scope.addressList = response.data;
				}
			}
		);
	}
	
	dateChange = function(date){
		 var dateee = new Date(date).toJSON();
		 var result = dateee.split("T");
		 return result[0];
	}
	
	$scope.updateUserInfo = function(){
		userCenterService.updateUserInfo($scope.enc,$scope.User).success(
			function(response){
				if(response.flag){
					alert("修改成功");
					window.location.reload(true);
				}
			}
		);
	}
}); 

