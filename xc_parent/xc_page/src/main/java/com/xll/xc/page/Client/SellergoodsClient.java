package com.xll.xc.page.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Result;

/**
 * ClassName : SellergoodsClient 
 * Description : 调用Sellergoods模块 
 * CreateDate : 2019年5月30日 上午8:42:58
 * Author : Yudachi
 * @Version : V1.0.0
 * @param
 */
@FeignClient(value = "xc-sellergoods")
public interface SellergoodsClient {

	@RequestMapping("/item/findItemById/{itemId}")
	public Result findItemById(@PathVariable("itemId") String itemId);
}
