package com.xll.xc.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.order.Pojo.Order;
import com.xll.xc.order.Service.OrderService;

import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/add")
	public Result addOrder(Order order) {
		orderService.addOrder(order);
		return new Result(true,StatusCode.OK,"订单添加成功");
	}
}
