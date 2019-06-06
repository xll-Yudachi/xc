package com.xll.xc.seller.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.OrderItem;


public interface OrderItemDao extends JpaRepository<OrderItem, String>,JpaSpecificationExecutor<OrderItem>{

	@Query(value="SELECT * from tb_order_item where order_id = ?",nativeQuery=true)
	public List<OrderItem> findByOrder_id(String order_id);
	
	@Modifying
	@Query(value = "UPDATE tb_order_item SET status = status + 1 WHERE id = ?",nativeQuery=true)
	public void changeStatus(String id);

}
