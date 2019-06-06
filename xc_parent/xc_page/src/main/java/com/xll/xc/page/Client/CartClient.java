package com.xll.xc.page.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Result;

@FeignClient(value = "xc-cart")
public interface CartClient {

	@RequestMapping("/cart/addItemToCartList/{enc}/{id}/{num}")
	public Result addItemToCartList(@PathVariable("enc") String enc,@PathVariable("id") String id ,@PathVariable("num") Integer num);

}
