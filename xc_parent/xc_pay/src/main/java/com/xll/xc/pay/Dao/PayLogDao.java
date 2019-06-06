package com.xll.xc.pay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.pay.Pojo.PayLog;

public interface PayLogDao extends JpaRepository<PayLog, String>,JpaSpecificationExecutor<PayLog>{

}
