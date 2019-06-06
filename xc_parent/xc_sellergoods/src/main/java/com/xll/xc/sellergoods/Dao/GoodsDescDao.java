package com.xll.xc.sellergoods.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.sellergoods.Pojo.GoodsDesc;

public interface GoodsDescDao extends JpaRepository<GoodsDesc, Long>,JpaSpecificationExecutor<GoodsDesc>{

	@Query(value="select * from tb_goods_desc where goods_id=?",nativeQuery=true)
	public GoodsDesc findByGoods_id(Long goods_id);
}
