package com.xll.xc.pay.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import entity.Result;

@FeignClient(value = "xc-order")
public interface OrderClient {
}
