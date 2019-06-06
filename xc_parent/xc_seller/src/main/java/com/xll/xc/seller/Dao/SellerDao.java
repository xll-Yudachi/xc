package com.xll.xc.seller.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.Seller;

public interface SellerDao extends JpaRepository<Seller, String>,JpaSpecificationExecutor<Seller>{

	@Query(value = "SELECT * from tb_seller WHERE seller_id=?",nativeQuery=true)
	public Seller findBySeller_id(String seller_id);
}
