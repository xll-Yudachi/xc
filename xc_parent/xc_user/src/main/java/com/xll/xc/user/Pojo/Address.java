package com.xll.xc.user.Pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class Address implements Serializable{
	
	@Id
	private Long id;
	private String user_id;
	private String country_id;
	private String province_id;
	private String city_id;
	private String town_id;
	private String mobile;
	private String address;
	private String contact;
	private String is_default;
	private String notes;
	private Timestamp create_date;
	private String alias;
	private String postalcode;
	
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProvince_id() {
		return province_id;
	}
	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getTown_id() {
		return town_id;
	}
	public void setTown_id(String town_id) {
		this.town_id = town_id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getIs_default() {
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Address(Long id, String user_id, String country_id,String province_id, String city_id, String town_id, String mobile,
			String address, String postalcode,String contact, String is_default, String notes, Timestamp create_date, String alias) {
		this.id = id;
		this.user_id = user_id;
		this.country_id = country_id;
		this.province_id = province_id;
		this.city_id = city_id;
		this.town_id = town_id;
		this.mobile = mobile;
		this.address = address;
		this.contact = contact;
		this.is_default = is_default;
		this.notes = notes;
		this.create_date = create_date;
		this.alias = alias;
		this.postalcode = postalcode;
	}
	public Address() {
	}
	
}
