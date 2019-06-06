package com.xll.xc.pay.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Result;

@FeignClient(value = "xc-cart")
public interface CartClient {
	@RequestMapping("/cart/showCartList/{enc}")
	public Result showCartList(@PathVariable("enc") String enc);
	@RequestMapping("/cart/{userId}")
	public Result getInfo(@PathVariable("userId") String userId);
}
