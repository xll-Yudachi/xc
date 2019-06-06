package com.xll.xc.user.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.user.Pojo.OrderItem;

public interface OrderItemDao extends JpaRepository<OrderItem, String>,JpaSpecificationExecutor<OrderItem>{

	@Query(value="SELECT * from tb_order_item where order_id = ?",nativeQuery=true)
	public List<OrderItem> findByOrder_id(String order_id);
}
