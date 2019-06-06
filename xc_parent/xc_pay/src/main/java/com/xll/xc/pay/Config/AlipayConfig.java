package com.xll.xc.pay.Config;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

@Configuration
@EnableConfigurationProperties(AlipayProperties.class)
public class AlipayConfig {

	@Autowired
	private AlipayProperties properties;

	/**
	 * alipay-trade-sdk
	 * @return
	 */
/*	@Bean
	public AlipayTradeService alipayTradeService() {
		return new AlipayTradeServiceImpl.ClientBuilder()
				.setGatewayUrl(properties.getGatewayUrl())
				.setAppid(properties.getAppid())
				.setPrivateKey(properties.getAppPrivateKey())
				.setAlipayPublicKey(properties.getAlipayPublicKey())
				.setSignType(properties.getSignType())
				.build();
	}*/

	/**
	 * alipay-sdk-java
	 * @return
	 */
	@Bean
	public AlipayClient alipayClient(){
		return new DefaultAlipayClient(properties.getGatewayUrl(),
				properties.getAppid(),
				properties.getAppPrivateKey(),
				properties.getFormate(),
				properties.getCharset(),
				properties.getAlipayPublicKey(),
				properties.getSignType());
	}
	
}