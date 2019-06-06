package com.xll.xc.portal.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.portal.Pojo.ItemCat;

public interface PortalDao extends JpaRepository<ItemCat, Long>,JpaSpecificationExecutor<ItemCat>{
	@Query(value = "select * from tb_item_cat where parentid=?",nativeQuery = true)
	public List<ItemCat> findByParentid(Long parentid);
}
