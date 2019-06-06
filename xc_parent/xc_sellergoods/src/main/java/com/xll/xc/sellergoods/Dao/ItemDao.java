package com.xll.xc.sellergoods.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.sellergoods.Pojo.Item;

public interface ItemDao extends JpaRepository<Item, String>,JpaSpecificationExecutor<Item>{
	
	@Query(value = "select * from tb_item where goods_id=?", nativeQuery=true)
	public Item findByGoods_id(Long goods_id);
}
