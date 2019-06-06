package com.xll.xc.portal.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.portal.Client.SearchClient;
import com.xll.xc.portal.Client.SellergoodsClient;
import com.xll.xc.portal.Client.UserClient;
import com.xll.xc.portal.Pojo.ItemCat;
import com.xll.xc.portal.Service.PortalService;

import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/portal")
public class PortalController {
	
	@Autowired
	private PortalService portalService;
	@Autowired
	private SellergoodsClient sellergoodsClient;
	@Autowired
	private UserClient userClient;
	@Autowired
	private SearchClient searchClient;
	
	@RequestMapping("/findByCategoryId")
	public Result findByCategoryId(Long categoryId) {
		List<ItemCat> list = portalService.findByParentId(categoryId);
		return new Result(true, StatusCode.OK, "查询成功",list);
	}
	
	@RequestMapping("/findAllSub")
	public Result findAllSub(){
		Map<Long, List<ItemCat>> map = portalService.findAllSub();
		return new Result(true,StatusCode.OK,"查询成功",map);
	}
	
	@RequestMapping("/goods/findAll")
	public Result findAllGoods() {
		return sellergoodsClient.findAll();
	}
	
	@RequestMapping("/goodsdesc/findAllGoodsDescByCategory2_Id/{categoryId}")
	public Result findAllGoodsDescByCategory2_Id(@PathVariable("categoryId") Long categoryId) {
		return sellergoodsClient.findAllGoodsDescByCategory2_Id(categoryId);
	}
	
	@RequestMapping("/goods/findByCategory1WithPage/{category1_id}")
	public Result findByCategory1WithPage(@PathVariable("category1_id") Long category1_id) {
		return sellergoodsClient.findByCategory1WithPage(category1_id);
	}
	
	@RequestMapping("/user/findUserById/{level}/{enc}")
	public Result findUserById(@PathVariable String level,@PathVariable String enc) {
		return userClient.findUserById(level, enc);
	}
	
	@RequestMapping("/item/findItemByGoodsId/{goodsId}")
	public Result findItemByGoodsId(@PathVariable Long goodsId) {
		return sellergoodsClient.findItemByGoodsId(goodsId);
	}
	
	@RequestMapping("/search/{key}/{page}/{size}")
	public Result findByKey(@PathVariable String key,@PathVariable int page, @PathVariable int size) {
		System.err.println("por:" + key);
		System.err.println("por:" + page);
		System.err.println("por:" + size);
		return searchClient.findByKey(key, page, size);
	}
}
