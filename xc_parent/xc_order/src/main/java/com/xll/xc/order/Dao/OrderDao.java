package com.xll.xc.order.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.order.Pojo.Order;

public interface OrderDao extends JpaRepository<Order, String>,JpaSpecificationExecutor<Order>{
	
}
