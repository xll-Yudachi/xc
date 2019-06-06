package com.xll.xc.sellergoods.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.sellergoods.Dao.GoodsDao;
import com.xll.xc.sellergoods.Dao.GoodsDescDao;
import com.xll.xc.sellergoods.Pojo.Goods;
import com.xll.xc.sellergoods.Pojo.GoodsDesc;

@Service
@Transactional
public class GoodsDescService {
	
	@Autowired
	private GoodsDescDao goodsDescDao;
	@Autowired
	private GoodsDao goodsDao;
	
	/**
	 * Title : findAllGoodsDescByCategory2_Id
	 * Description : 根据二级分类查询所有商品详情
	 * CreateDate : 2019年4月26日 下午11:10:58
	 * Author : Yudachi
	 * @param categoryId
	 * @return
	 * List<GoodsDesc>
	 * @throws
	 */
	public List<GoodsDesc> findAllGoodsDescByCategory2_Id(Long categoryId){
		List<Goods> list = goodsDao.findByCategory2_id(categoryId);
		List<GoodsDesc> goodsDescList = new ArrayList<>();
		for(Goods goods : list) {
			goodsDescList.add(goodsDescDao.findByGoods_id(goods.getId()));
		}
		return goodsDescList;
	}
}
