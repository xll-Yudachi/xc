package com.xll.xc.sellergoods.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.sellergoods.Pojo.Goods;

public interface GoodsDao extends JpaRepository<Goods, Long>,JpaSpecificationExecutor<Goods>{
	
	@Query(value = "select * from tb_goods where category2_id=?", nativeQuery=true)
	public List<Goods> findByCategory2_id(Long category2_id);

}
