package com.xll.xc.seller.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.Order;


public interface OrderDao extends JpaRepository<Order, String>,JpaSpecificationExecutor<Order>{

	@Query(value = "SELECT * from tb_order where seller_id = ?",nativeQuery=true)
	public List<Order> findBySeller_id(String seller_id);
	
	@Query(value = "SELECT * from tb_order where seller_id=? and order_id=?", nativeQuery=true)
	public List<Order> findBySeller_idAndOrder_id(String seller_id,String order_id);
}
