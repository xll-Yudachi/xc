package com.xll.xc.pay.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	@Id
	private String id;
	private String item_id;
	private String goods_id;
	private String order_id;
	private String title;
	private BigDecimal price;
	private Integer num;
	private BigDecimal total_fee;
	private String pic_path;
	private String seller_id;
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
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public BigDecimal getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(BigDecimal total_fee) {
		this.total_fee = total_fee;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public OrderItem(String status,String id, String item_id, String goods_id, String order_id, String title, BigDecimal price,
			Integer num, BigDecimal total_fee, String pic_path, String seller_id) {
		this.status = status;
		this.id = id;
		this.item_id = item_id;
		this.goods_id = goods_id;
		this.order_id = order_id;
		this.title = title;
		this.price = price;
		this.num = num;
		this.total_fee = total_fee;
		this.pic_path = pic_path;
		this.seller_id = seller_id;
	}
	public OrderItem() {
	}
	
	
}
