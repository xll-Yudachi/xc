package com.xll.xc.seller.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.Item;

public interface ItemDao extends JpaRepository<Item, String>,JpaSpecificationExecutor<Item>{

	@Query(value = "SELECT * from tb_item where seller_id = ?",nativeQuery=true)
	public Page<Item> findBySeller_id(String seller_id,Pageable pageable);

	@Query(value = "SELECT * from tb_item WHERE seller_id = ? and title like CONCAT('%',?,'%') ",nativeQuery=true)
	public Page<Item> search(String seller_id,String key,Pageable pageable);

}
