package com.xll.xc.user.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User implements Serializable{
	
	@Id
	private String id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private Timestamp created;
	private Timestamp updated;
	private String source_type;
	private String nick_name;
	private String name;
	private String status;
	private String head_pic;
	private String qq;
	private BigDecimal account_balance;
	private String is_mobile_check;
	private String is_email_check;
	private String sex;
	private Integer user_level;
	private Integer points;
	private Integer experience_value;
	private Timestamp birthday;
	private Timestamp last_login_time;
	
	public User(String id, String username, String password, String phone, String email, Timestamp created,
			Timestamp updated, String source_type, String nick_name, String name, String status, String head_pic,
			String qq, BigDecimal account_balance, String is_mobile_check, String is_email_check, String sex,
			Integer user_level, Integer points, Integer experience_value, Timestamp birthday,
			Timestamp last_login_time) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.updated = updated;
		this.source_type = source_type;
		this.nick_name = nick_name;
		this.name = name;
		this.status = status;
		this.head_pic = head_pic;
		this.qq = qq;
		this.account_balance = account_balance;
		this.is_mobile_check = is_mobile_check;
		this.is_email_check = is_email_check;
		this.sex = sex;
		this.user_level = user_level;
		this.points = points;
		this.experience_value = experience_value;
		this.birthday = birthday;
		this.last_login_time = last_login_time;
	}
	
	
	public User() {
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public Timestamp getUpdated() {
		return updated;
	}
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHead_pic() {
		return head_pic;
	}
	public void setHead_pic(String head_pic) {
		this.head_pic = head_pic;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public BigDecimal getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(BigDecimal account_balance) {
		this.account_balance = account_balance;
	}
	public String getIs_mobile_check() {
		return is_mobile_check;
	}
	public void setIs_mobile_check(String is_mobile_check) {
		this.is_mobile_check = is_mobile_check;
	}
	public String getIs_email_check() {
		return is_email_check;
	}
	public void setIs_email_check(String is_email_check) {
		this.is_email_check = is_email_check;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getUser_level() {
		return user_level;
	}
	public void setUser_level(Integer user_level) {
		this.user_level = user_level;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getExperience_value() {
		return experience_value;
	}
	public void setExperience_value(Integer experience_value) {
		this.experience_value = experience_value;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public Timestamp getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(Timestamp last_login_time) {
		this.last_login_time = last_login_time;
	}
	
	
}
