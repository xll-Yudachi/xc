app.controller('pageController',function($scope,pageService){

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
	
	$scope.num = 1;
	
	$scope.Add = function(){
		$scope.num = $scope.num+1;
	}
	
	$scope.Sub = function(){
		if($scope.num >= 2){
			$scope.num = $scope.num-1;
		}
	}
}); 

