package com.xll.xc.pay.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xll.xc.pay.Client.CartClient;
import com.xll.xc.pay.Pojo.TotalResult;

import entity.Result;
import entity.StatusCode;


@RestController
@CrossOrigin
@RequestMapping("/pay")
public class InfoController {
	
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private CartClient cartClient;
	
	@GetMapping("/cart/{userId}")
	public Result getInfo(@PathVariable String userId) {
		
		return new Result(true, StatusCode.OK, "查询成功",cartClient.getInfo(userId).getData());
	
	}
	
}
