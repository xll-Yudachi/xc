package com.xll.xc.sellergoods.Pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_goods_desc")
public class GoodsDesc implements Serializable {

	@Id
	private Long goods_id;
	private String introduction; // 描述
	private String specification_items; // 规格
	private String custom_attribute_items; // 自定义参数规格
	private String item_images; // 图片
	private String package_list; // 包装列表
	private String sale_service; // 售后服务

	public GoodsDesc() {
	}

	public GoodsDesc(Long goods_id, String introduction, String specification_items, String custom_attribute_items,
			String item_images, String package_list, String sale_service) {
		this.goods_id = goods_id;
		this.introduction = introduction;
		this.specification_items = specification_items;
		this.custom_attribute_items = custom_attribute_items;
		this.item_images = item_images;
		this.package_list = package_list;
		this.sale_service = sale_service;
	}

	public Long getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Long goods_id) {
		this.goods_id = goods_id;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getSpecification_items() {
		return specification_items;
	}

	public void setSpecification_items(String specification_items) {
		this.specification_items = specification_items;
	}

	public String getCustom_attribute_items() {
		return custom_attribute_items;
	}

	public void setCustom_attribute_items(String custom_attribute_items) {
		this.custom_attribute_items = custom_attribute_items;
	}

	public String getItem_images() {
		return item_images;
	}

	public void setItem_images(String item_images) {
		this.item_images = item_images;
	}

	public String getPackage_list() {
		return package_list;
	}

	public void setPackage_list(String package_list) {
		this.package_list = package_list;
	}

	public String getSale_service() {
		return sale_service;
	}

	public void setSale_service(String sale_service) {
		this.sale_service = sale_service;
	}

}
