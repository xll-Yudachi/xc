package com.xll.xc.pay.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.pay.Dao.PayLogDao;
import com.xll.xc.pay.Pojo.PayLog;

@Transactional
@Service
public class PayLogService {

	@Autowired
	private PayLogDao payLogDao;
	
	public void addPayLog(PayLog payLog) {
		payLogDao.save(payLog);
	}
	
	
}
