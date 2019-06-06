package com.xll.xc.sms.util;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

/**
 * ClassName : SmsUtil 
 * Description : 短信工具类 
 * CreateDate : 2019年5月28日 下午8:09:13
 * Author : Yudachi
 * @Version : V1.0.0
 */
@Component
public class SmsUtil {
	
	@Autowired
	private Environment environment;
	
	public void sendSms(String mobile,String checkCode) {
		Integer appid = Integer.valueOf(environment.getProperty("appid"));
		String appkey = environment.getProperty("appkey");
		Integer templateId = Integer.valueOf(environment.getProperty("templateId"));
		String sign = environment.getProperty("sign");
		try {
			String[] params = {checkCode,"30"};
			SmsSingleSender sender = new SmsSingleSender(appid, appkey);
			SmsSingleSenderResult result = sender.sendWithParam("86", mobile, templateId, params, sign , "", "");
			System.out.println(result);
		} catch (HTTPException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
