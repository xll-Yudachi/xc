package com.xll.xc.sellergoods.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.sellergoods.Pojo.Item;
import com.xll.xc.sellergoods.Service.ItemService;

import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/findItemById/{itemId}")
	public Result findItemById(@PathVariable String itemId) {
		List<Object> list = itemService.findItemById(itemId);
		return new Result(true, StatusCode.OK, "查询成功！",list);
	}
	
	@GetMapping("/findItemByGoodsId/{goodsId}")
	public Result findItemByGoodsId(@PathVariable Long goodsId) {
		Item item = itemService.findByGodosId(goodsId);
		System.err.println("itemId" + item.getId());
		return new Result(true, StatusCode.OK, "查询成功！",item);
	}
}
