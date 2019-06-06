package com.xll.xc.seller.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.seller.Pojo.PayLog;

public interface PayLogDao extends JpaRepository<PayLog, String>,JpaSpecificationExecutor<PayLog>{
	
	@Query(value="SELECT * from tb_pay_log where seller_id = ? and create_time BETWEEN ? and ?",nativeQuery=true)
	public List<PayLog> findBySellerId(String seller_id,String startTime,String endTime);

}
