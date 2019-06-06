package com.xll.xc.sms.listener;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xll.xc.sms.util.SmsUtil;

/**
 * ClassName : SmsListener 
 * Description : 短信服务监听类 
 * CreateDate : 2019年5月28日 下午8:16:23
 * Author : Yudachi
 * @Version : V1.0.0
 */
@Component
@RabbitListener(queues = "xc")
public class SmsListener {

	@Autowired
	private SmsUtil smsUtil;
	
	@RabbitHandler
	public void executeSms(Map<String, String> map) {
		smsUtil.sendSms(map.get("mobile"), map.get("checkCode"));
	}
}
