package com.xll.xc.cart.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.cart.Pojo.Item;
import com.xll.xc.cart.Pojo.TotalResult;
import com.xll.xc.cart.Service.CartService;
import com.xll.xc.cart.Service.ItemService;

import entity.Result;
import entity.StatusCode;
import io.jsonwebtoken.Claims;
import util.JwtUtil;

@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/addItemToCartList/{enc}/{id}/{num}")
	public Result addItemToCartList(@PathVariable String enc,@PathVariable String id,@PathVariable Integer num) {
		Claims claims = jwtUtil.parseJWT(enc);
		String currentUserId = claims.getId();
		cartService.addItemToCartList(currentUserId,id,num);
		return new Result(true,StatusCode.OK,"添加成功");
	}
	
	@GetMapping("/showCartList/{enc}")
	public Result showCartList(@PathVariable String enc) {
		Claims claims = jwtUtil.parseJWT(enc);
		String currentUserId = claims.getId();
		List<TotalResult> list = cartService.showCartList(currentUserId);
		return new Result(true,StatusCode.OK,"查看成功",list);
	}
	
	@GetMapping("/{userId}")
	public Result getInfo(@PathVariable String userId) {
		List<TotalResult> list = cartService.showCartList(userId);
		return new Result(true,StatusCode.OK,"查看成功",list);
	}
	
	@GetMapping("/info/{enc}")
	public Result getUserId(@PathVariable String enc) {
		Claims claims = jwtUtil.parseJWT(enc);
		return new Result(true,StatusCode.OK,"查看成功",claims.getId());
	}
}
