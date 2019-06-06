package com.xll.xc.user.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.user.Pojo.Address;

public interface AddressDao extends JpaRepository<Address,Long>,JpaSpecificationExecutor<Address>{

	@Query(value = "SELECT * from tb_address where user_id = ?",nativeQuery=true)
	public List<Address> findAddressByEnc(String user_id);
}
