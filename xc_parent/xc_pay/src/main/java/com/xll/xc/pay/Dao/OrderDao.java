package com.xll.xc.pay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.pay.Pojo.Order;

public interface OrderDao extends JpaRepository<Order, String>,JpaSpecificationExecutor<Order>{

}
