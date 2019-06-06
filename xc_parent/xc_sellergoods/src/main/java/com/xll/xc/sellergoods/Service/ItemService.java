package com.xll.xc.sellergoods.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.sellergoods.Dao.GoodsDao;
import com.xll.xc.sellergoods.Dao.GoodsDescDao;
import com.xll.xc.sellergoods.Dao.ItemDao;
import com.xll.xc.sellergoods.Pojo.Goods;
import com.xll.xc.sellergoods.Pojo.GoodsDesc;
import com.xll.xc.sellergoods.Pojo.Item;

import util.ImagesUtil;
import util.SpecUtil;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private GoodsDescDao goodsDescDao;
	@Autowired
	private ImagesUtil imagesUtil;
	@Autowired
	private SpecUtil specUtil;
	
	public List<Object> findItemById(String id) {
		List<Object> list = new ArrayList<>();
		Item item = itemDao.findById(id).get();
		list.add(item);
		Goods goods = goodsDao.findById(item.getGoods_id()).get();
		System.err.println(goods.getGoods_name());
		list.add(goods);
		list.add(imagesUtil.ImagesStringToList(goods.getSmall_pic()));
		GoodsDesc goodsDesc = goodsDescDao.findByGoods_id(goods.getId());
		list.add(goodsDesc);
		List<String> specList = specUtil.SpecStringToList(goodsDesc.getSpecification_items());
		list.add(specList);
		for(String string : specList) {
			System.err.println(string);
		}
		Map map = specUtil.ChooseSpec(specList);
		list.add(map);
		
		return list;
	}
	
	public Item findByGodosId(Long goodsId) {
		return itemDao.findByGoods_id(goodsId);
	}
}
