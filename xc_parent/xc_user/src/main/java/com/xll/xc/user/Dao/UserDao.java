package com.xll.xc.user.Dao;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.xll.xc.user.Pojo.User;

public interface UserDao extends JpaRepository<User, String>,JpaSpecificationExecutor<User>{
	/**
	 * Title : findByPhone
	 * Description : 根据电话查询用户
	 * CreateDate : 2019年5月29日 下午3:41:59
	 * Author : Yudachi
	 * @param phone
	 * @return
	 * User
	 * @throws
	 */
	public User findByPhone(String phone);
	
	@Modifying
	@Query(value = "update tb_user  set username = ?, name = ? , birthday = ?, sex = ?, email = ?, qq = ? , phone = ? where id = ?",nativeQuery=true)
	public void updateUserInfoById(String username,String name,Timestamp birthday,String sex,String email,String qq,String phone,String id);
}
