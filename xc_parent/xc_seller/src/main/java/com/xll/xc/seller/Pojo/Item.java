package com.xll.xc.seller.Pojo;

import javax.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "tb_item")
public class Item implements Serializable{
	@Id
	private String id;
	private String title;
	private String sell_point;
	private BigDecimal price;
	private Integer stock_count;
	private Integer num;
	private String barcode;
	private String image;
	private Long categoryid;
	private String status;
	private Timestamp create_time;
	private Timestamp update_time;
	private String item_sn;
	private BigDecimal cost_pirce;
	private BigDecimal market_price;
	private String is_default;
	private Long goods_id;
	private String seller_id;
	private String cart_thumbnail;
	private String category;
	private String brand;
	private String spec;
	private String seller;
	public Item() {
	}
	public Item(String id, String title, String sell_point, BigDecimal price, Integer stock_count, Integer num,
			String barcode, String image, Long categoryid, String status, Timestamp create_time, Timestamp update_time,
			String item_sn, BigDecimal cost_pirce, BigDecimal market_price, String is_default, Long goods_id,
			String seller_id, String cart_thumbnail, String category, String brand, String spec, String seller) {
		this.id = id;
		this.title = title;
		this.sell_point = sell_point;
		this.price = price;
		this.stock_count = stock_count;
		this.num = num;
		this.barcode = barcode;
		this.image = image;
		this.categoryid = categoryid;
		this.status = status;
		this.create_time = create_time;
		this.update_time = update_time;
		this.item_sn = item_sn;
		this.cost_pirce = cost_pirce;
		this.market_price = market_price;
		this.is_default = is_default;
		this.goods_id = goods_id;
		this.seller_id = seller_id;
		this.cart_thumbnail = cart_thumbnail;
		this.category = category;
		this.brand = brand;
		this.spec = spec;
		this.seller = seller;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSell_point() {
		return sell_point;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getStock_count() {
		return stock_count;
	}
	public void setStock_count(Integer stock_count) {
		this.stock_count = stock_count;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getcategoryid() {
		return categoryid;
	}
	public void setcategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public String getItem_sn() {
		return item_sn;
	}
	public void setItem_sn(String item_sn) {
		this.item_sn = item_sn;
	}
	public BigDecimal getCost_pirce() {
		return cost_pirce;
	}
	public void setCost_pirce(BigDecimal cost_pirce) {
		this.cost_pirce = cost_pirce;
	}
	public BigDecimal getMarket_price() {
		return market_price;
	}
	public void setMarket_price(BigDecimal market_price) {
		this.market_price = market_price;
	}
	public String getIs_default() {
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
	public Long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Long goods_id) {
		this.goods_id = goods_id;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getCart_thumbnail() {
		return cart_thumbnail;
	}
	public void setCart_thumbnail(String cart_thumbnail) {
		this.cart_thumbnail = cart_thumbnail;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
}
