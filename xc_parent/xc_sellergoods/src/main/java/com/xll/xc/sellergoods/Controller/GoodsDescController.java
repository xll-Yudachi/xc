package com.xll.xc.sellergoods.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.sellergoods.Pojo.GoodsDesc;
import com.xll.xc.sellergoods.Service.GoodsDescService;

import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/goodsdesc")
public class GoodsDescController {

	@Autowired
	private GoodsDescService goodsDescService;
	
	/**
	 * Title : findAllGoodsDescByCategory2_Id
	 * Description : 根据二级目录分类查询所有商品的商品详情
	 * CreateDate : 2019年4月26日 下午11:09:48
	 * Author : Yudachi
	 * @param categoryId
	 * @return
	 * Result
	 * @throws
	 */
	@RequestMapping("/findAllGoodsDescByCategory2_Id/{categoryId}")
	public Result findAllGoodsDescByCategory2_Id(@PathVariable Long categoryId) {
		List<GoodsDesc> list = goodsDescService.findAllGoodsDescByCategory2_Id(categoryId);
		return new Result(true,StatusCode.OK,"查询成功",list);
	}
}
