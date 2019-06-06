package com.xll.xc.cart.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.cart.Dao.ItemDao;
import com.xll.xc.cart.Pojo.Item;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	public Item findItemById(String id) {
		return itemDao.findById(id).get();
	}
}
