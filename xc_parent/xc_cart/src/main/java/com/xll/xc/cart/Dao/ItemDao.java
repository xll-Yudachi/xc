package com.xll.xc.cart.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.cart.Pojo.Item;

public interface ItemDao extends JpaRepository<Item, String>,JpaSpecificationExecutor<Item>{

}
