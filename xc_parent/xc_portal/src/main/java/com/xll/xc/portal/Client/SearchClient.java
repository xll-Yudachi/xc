package com.xll.xc.portal.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Result;

@FeignClient(value = "xc-search")
public interface SearchClient {
	@RequestMapping("/search/{key}/{page}/{size}")
	public Result findByKey(@PathVariable("key") String key,@PathVariable("page") int page, @PathVariable("size") int size);
}
