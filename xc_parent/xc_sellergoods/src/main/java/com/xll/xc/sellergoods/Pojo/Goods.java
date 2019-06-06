package com.xll.xc.sellergoods.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_goods")
public class Goods implements Serializable {
	@Id
	private Long id;
	private String seller_id; // 商家ID
	private String goods_name; // SPU商品名称
	private Long default_item_id; // 默认SKU商品
	private String audit_status; // 状态
	private String is_marketable; // 是否上架
	private Long brand_id; // 品牌
	private String caption; // 副标题
	private Long category1_id; // 一级目录
	private Long category2_id; // 二级目录
	private String small_pic; // 小图
	private Double price; // 商城价
	private Long type_template_id; // 分类模板ID
	private String is_enable_spec; // 是否启用规格
	private String is_delete; // 是否删除
	private BigDecimal preferentialprice;//优惠价
	public Goods() {
	}

	public Goods(Long id, String seller_id, String goods_name, Long default_item_id, String audit_status,
			String is_marketable, Long brand_id, String caption, Long category1_id, Long category2_id, String small_pic,
			Double price, Long type_template_id, String is_enable_spec, String is_delete,BigDecimal preferentialprice) {
		this.id = id;
		this.seller_id = seller_id;
		this.goods_name = goods_name;
		this.default_item_id = default_item_id;
		this.audit_status = audit_status;
		this.is_marketable = is_marketable;
		this.brand_id = brand_id;
		this.caption = caption;
		this.category1_id = category1_id;
		this.category2_id = category2_id;
		this.small_pic = small_pic;
		this.price = price;
		this.type_template_id = type_template_id;
		this.is_enable_spec = is_enable_spec;
		this.is_delete = is_delete;
		this.preferentialprice = preferentialprice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public Long getDefault_item_id() {
		return default_item_id;
	}

	public void setDefault_item_id(Long default_item_id) {
		this.default_item_id = default_item_id;
	}

	public String getAudit_status() {
		return audit_status;
	}

	public void setAudit_status(String audit_status) {
		this.audit_status = audit_status;
	}

	public String getIs_marketable() {
		return is_marketable;
	}

	public void setIs_marketable(String is_marketable) {
		this.is_marketable = is_marketable;
	}

	public Long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Long getCategory1_id() {
		return category1_id;
	}

	public void setCategory1_id(Long category1_id) {
		this.category1_id = category1_id;
	}

	public Long getCategory2_id() {
		return category2_id;
	}

	public void setCategory2_id(Long category2_id) {
		this.category2_id = category2_id;
	}

	public String getSmall_pic() {
		return small_pic;
	}

	public void setSmall_pic(String small_pic) {
		this.small_pic = small_pic;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getType_template_id() {
		return type_template_id;
	}

	public void setType_template_id(Long type_template_id) {
		this.type_template_id = type_template_id;
	}

	public String getIs_enable_spec() {
		return is_enable_spec;
	}

	public void setIs_enable_spec(String is_enable_spec) {
		this.is_enable_spec = is_enable_spec;
	}

	public String getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}

	public BigDecimal getPreferentialprice() {
		return preferentialprice;
	}

	public void setPreferentialprice(BigDecimal preferentialprice) {
		this.preferentialprice = preferentialprice;
	}
}
