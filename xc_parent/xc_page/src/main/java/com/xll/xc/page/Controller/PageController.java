package com.xll.xc.page.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xll.xc.page.Client.CartClient;
import com.xll.xc.page.Client.SellergoodsClient;
import com.xll.xc.page.Client.UserClient;

import entity.Result;
import entity.StatusCode;
import io.jsonwebtoken.Claims;


@RestController
@CrossOrigin
@RequestMapping("/page")
public class PageController {

	@Autowired
	private SellergoodsClient sellergoodsClient;
	@Autowired
	private UserClient userClient;
	@Autowired
	private CartClient cartClient;
	
	@GetMapping("/item/findItemById/{itemId}/{enc}/{level}")
	public ModelAndView findItemById(@PathVariable String itemId,@PathVariable String level,@PathVariable String enc,Model model) {
		List list = (List)sellergoodsClient.findItemById(itemId).getData();
		model.addAttribute("item",list.get(0));
		model.addAttribute("goods",list.get(1));
		model.addAttribute("smallpicList", list.get(2));
		model.addAttribute("goodsdesc", list.get(3));
		model.addAttribute("specList", list.get(4));
		model.addAttribute("chooseSpecList", list.get(5));
		model.addAttribute("user", userClient.findUserById(level, enc).getData());
		model.addAttribute("level",level);
		return new ModelAndView("index","itemModel",model);
	}
	
	@GetMapping("/cart/addItemToCartList/{enc}/{id}/{num}")
	public Result addItemToCartList(@PathVariable String enc,@PathVariable String id,@PathVariable Integer num) {
		return cartClient.addItemToCartList(enc, id, num);
	}
}
