package com.xll.xc.user.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xll.xc.user.Pojo.Seller;

public interface SellerDao extends JpaRepository<Seller, String>,JpaSpecificationExecutor<Seller>{
	/**
	 * Title : findBymobile
	 * Description : 根据手机号查询卖家
	 * CreateDate : 2019年5月29日 下午3:48:37
	 * Author : Yudachi
	 * @param mobile
	 * @return
	 * Seller
	 * @throws
	 */
	public Seller findBymobile(String mobile);
	
}
