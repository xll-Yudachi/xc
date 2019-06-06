package com.xll.xc.sellergoods.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.sellergoods.Pojo.Goods;
import com.xll.xc.sellergoods.Service.GoodsService;

import entity.PageResult;
import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	/**
	 * Title : findAll
	 * Description : 查询所有商品 
	 * CreateDate : 2019年4月26日 下午11:05:44
	 * Author : Yudachi
	 * @return
	 * Result
	 * @throws
	 */
	@RequestMapping("/findAll")
	public Result findAll() {
		List<Goods> list = goodsService.findAllGoods();
		System.out.println("sellergoods:" + list.toString());
		return new Result(true, StatusCode.OK, "查询成功",list);
	}
	
	/**
	 * Title : findByCategory1WithPage
	 * Description : 根据一级目录类别分页查询商品
	 * CreateDate : 2019年4月26日 下午11:08:55
	 * Author : Yudachi
	 * @param category1_id
	 * @return
	 * Result
	 * @throws
	 */
	@RequestMapping("/findByCategory1WithPage/{category1_id}")
	public Result findByCategory1WithPage(@PathVariable Long category1_id) {
		Page<Goods> pageList = goodsService.findCategory1GoodsByPage(category1_id, 1, 4);
		return new Result(true,StatusCode.OK,"分页查询成功",new PageResult<Goods>(pageList.getTotalElements(), pageList.getContent()));
	}
}
