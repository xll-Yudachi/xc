app.controller('goodsController',function($scope,goodsService,goodsDescService){
	

	$scope.goodsdescImage = []
	//当前的分类ID
	$scope.currentCategoryId;
	
	$scope.findAllGoods=function(){
		//查找所有商品
		goodsService.findAllGoods().success(
			function(response){
				$scope.goodslist = response.data;
				for(var i=0; i<$scope.goodslist.length;i++){
					$scope.goodslist[i].small_pic = SplitStringByComma($scope.goodslist[i].small_pic);
				}
			}
		);		
	}
	
	$scope.findCategory1GoodsByPage = function(category1_id){
		//分页查询指定一级目录的商品
		goodsService.findCategory1GoodsByPage(category1_id).success(
			function(response){
				$scope.category1List = response.data.rows;
				for(var i=0; i<$scope.category1List.length;i++){
					$scope.category1List[i].small_pic = SplitStringByComma($scope.category1List[i].small_pic);
				}
				$scope.currentCategoryId = $scope.category1List[0].category2_id;
				//根据指定商品分类查询商品描述
				goodsDescService.findAllGoodsDescByCategory2_Id($scope.currentCategoryId).success(
					function(response){
						$scope.goodsdesclist = response.data;
						for(var i = 0; i<$scope.goodsdesclist.length;i++){
							$scope.goodsdescImage[$scope.goodsdesclist[i].goods_id] = $scope.goodsdesclist[i].item_images;
						}
					}
				);	
			}
		);
	}
	
	SplitStringByComma = function(string){
		return string.split(",");
	}
	
	ReplaceBrackets = function(string){
		return string.replace("[\[\]]","");
	}
}); 
