package com.xll.xc.seller.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.Shop;

public interface ShopDao extends JpaRepository<Shop, String>,JpaSpecificationExecutor<Shop>{

	@Query(value = "SELECT * from tb_shop where seller_id = ?",nativeQuery=true)
	public Page<Shop> findShopBySellerId(String seller_id,Pageable pageable);

}
