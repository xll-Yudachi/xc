package com.xll.xc.seller.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_shop")
public class Shop {
	@Id
	private String id;
	private String seller_id;
	private String shop_name;
	private String province_id;
	private String city_id;
	private String town_id;
	private String brief;
	private String image;
	private String legal_person_card_id;
	private String license_number;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLegal_person_card_id() {
		return legal_person_card_id;
	}
	public void setLegal_person_card_id(String legal_person_card_id) {
		this.legal_person_card_id = legal_person_card_id;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public Shop(String status,String id, String seller_id, String shop_name, String province_id, String city_id, String town_id,
			String brief, String image, String legal_person_card_id, String license_number) {
		this.status = status;
		this.id = id;
		this.seller_id = seller_id;
		this.shop_name = shop_name;
		this.province_id = province_id;
		this.city_id = city_id;
		this.town_id = town_id;
		this.brief = brief;
		this.image = image;
		this.legal_person_card_id = legal_person_card_id;
		this.license_number = license_number;
	}
	public Shop() {
	}
	
}
