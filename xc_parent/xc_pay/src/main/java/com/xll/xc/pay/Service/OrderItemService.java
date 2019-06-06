package com.xll.xc.pay.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.pay.Dao.OrderItemDao;
import com.xll.xc.pay.Pojo.OrderItem;

@Service
@Transactional
public class OrderItemService {
	
	@Autowired
	private OrderItemDao orderItemDao;
	
	public void addOrderItem(OrderItem orderItem) {
		orderItemDao.save(orderItem);
	}
}
