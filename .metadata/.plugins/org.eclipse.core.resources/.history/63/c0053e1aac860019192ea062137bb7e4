app.controller('userController',function($scope,userService,$http){
	
	$scope.level = 1;
	
	$scope.CustomerLevel = function(){
		$scope.level = 1;
	}
	
	$scope.SellerLevel = function(){
		$scope.level = 2;
	}
	
	$scope.registerUser=function(){
		//判断两次密码输入是否一致
		if($scope.entity.password != $scope.checkPassword){
			alert("两次密码输入不一致，请重新输入");
			$scope.entity.password="";
			$scope.checkPassword="";
			return ;
		}
		
		//用户注册
		userService.registerUser($scope.level,$scope.entity,$scope.checkCode).success(
			function(response){
				if(response.flag){
					window.location.href="http://localhost:9106/login.html";
				}else{
					alert(response.message);
				}
			}
		);		
	}
	
	$scope.sendSms = function(){
		userService.sendSms($scope.entity.phone).success(
			function(response){
				if(response.flag){
					alert("验证码发送成功");
				}else{
					alert("验证码发送失败");
				}
			}	
		);
	}
	
	$scope.userLogin = function(){
		userService.userLogin($scope.entity).success(
			function(response){
				if(response.flag){
					alert(response.message);
					$scope.user = response.data;
					window.location.href="http://localhost:9001#?enc=" + $scope.user.token + "&level=" + $scope.level;
				}else{
					alert("登录失败")
				}
			}	
		);
	}
	
	$scope.sellerLogin = function(){
		userService.sellerLogin($scope.entity).success(
			function(response){
				if(response.flag){
					alert(response.message);
					$scope.seller = response.data;
					window.location.href="http://localhost:9001#?enc=" + $scope.seller.token + "&level=" + $scope.level;
				}else{
					alert("登录失败");
				}
			}	
		);
		
	}
}); 

