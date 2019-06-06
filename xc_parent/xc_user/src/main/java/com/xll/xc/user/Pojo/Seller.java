package com.xll.xc.user.Pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_seller")
public class Seller implements Serializable{
	@Id
	private String seller_id;
	private String name;
	private String nick_name;
	private String password;
	private String email;
	private String mobile;
	private String telephone;
	private String status;
	private String address_detail;
	private String linkman_name;
	private String linkman_qq;
	private String linkman_mobile;
	private String linkman_email;
	private String license_number;
	private String tax_number;
	private String org_number;
	private String address;
	private String logo_pic;
	private String brief;
	private Timestamp create_time;
	private String legal_person;
	private String legal_person_card_id;
	private String bank_user;
	private String bank_name;
	public Seller(String seller_id, String name, String nick_name, String password, String email, String mobile,
			String telephone, String status, String address_detail, String linkman_name, String linkman_qq,
			String linkman_mobile, String linkman_email, String license_number, String tax_number, String org_number,
			String address, String logo_pic, String brief, Timestamp create_time, String legal_person,
			String legal_person_card_id, String bank_user, String bank_name) {
		this.seller_id = seller_id;
		this.name = name;
		this.nick_name = nick_name;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.telephone = telephone;
		this.status = status;
		this.address_detail = address_detail;
		this.linkman_name = linkman_name;
		this.linkman_qq = linkman_qq;
		this.linkman_mobile = linkman_mobile;
		this.linkman_email = linkman_email;
		this.license_number = license_number;
		this.tax_number = tax_number;
		this.org_number = org_number;
		this.address = address;
		this.logo_pic = logo_pic;
		this.brief = brief;
		this.create_time = create_time;
		this.legal_person = legal_person;
		this.legal_person_card_id = legal_person_card_id;
		this.bank_user = bank_user;
		this.bank_name = bank_name;
	}
	public Seller() {
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public String getLinkman_name() {
		return linkman_name;
	}
	public void setLinkman_name(String linkman_name) {
		this.linkman_name = linkman_name;
	}
	public String getLinkman_qq() {
		return linkman_qq;
	}
	public void setLinkman_qq(String linkman_qq) {
		this.linkman_qq = linkman_qq;
	}
	public String getLinkman_mobile() {
		return linkman_mobile;
	}
	public void setLinkman_mobile(String linkman_mobile) {
		this.linkman_mobile = linkman_mobile;
	}
	public String getLinkman_email() {
		return linkman_email;
	}
	public void setLinkman_email(String linkman_email) {
		this.linkman_email = linkman_email;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getTax_number() {
		return tax_number;
	}
	public void setTax_number(String tax_number) {
		this.tax_number = tax_number;
	}
	public String getOrg_number() {
		return org_number;
	}
	public void setOrg_number(String org_number) {
		this.org_number = org_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo_pic() {
		return logo_pic;
	}
	public void setLogo_pic(String logo_pic) {
		this.logo_pic = logo_pic;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public String getLegal_person() {
		return legal_person;
	}
	public void setLegal_person(String legal_person) {
		this.legal_person = legal_person;
	}
	public String getLegal_person_card_id() {
		return legal_person_card_id;
	}
	public void setLegal_person_card_id(String legal_person_card_id) {
		this.legal_person_card_id = legal_person_card_id;
	}
	public String getBank_user() {
		return bank_user;
	}
	public void setBank_user(String bank_user) {
		this.bank_user = bank_user;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
}
