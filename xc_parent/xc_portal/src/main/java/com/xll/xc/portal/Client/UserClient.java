package com.xll.xc.portal.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Result;

@FeignClient(value = "xc-user")
public interface UserClient {
	
	@RequestMapping("/user/findUserById/{level}/{enc}")
	public Result findUserById(@PathVariable("level") String level,@PathVariable("enc") String enc);

}
