package com.xll.xc.pay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.pay.Pojo.OrderItem;

public interface OrderItemDao extends JpaRepository<OrderItem, String>,JpaSpecificationExecutor<OrderItem>{

}
