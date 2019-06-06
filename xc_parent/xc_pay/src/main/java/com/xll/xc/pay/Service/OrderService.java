package com.xll.xc.pay.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.pay.Dao.OrderDao;
import com.xll.xc.pay.Pojo.Order;

@Transactional
@Service
public class OrderService{
	@Autowired
	private OrderDao orderDao;
	
	public void addOrder(Order order) {
		orderDao.save(order);
	}
}
