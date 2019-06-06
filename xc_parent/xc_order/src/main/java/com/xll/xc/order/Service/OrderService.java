package com.xll.xc.order.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.order.Dao.OrderDao;
import com.xll.xc.order.Pojo.Order;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderDao orderDao;
	
	public void addOrder(Order order) {
		orderDao.save(order);
	}
}
