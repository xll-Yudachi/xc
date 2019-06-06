package com.xll.xc.seller.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bouncycastle.util.Times;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable{
	@Id
	private String order_id;
	private BigDecimal payment;
	private String payment_type;
	private String post_fee;
	private String status;
	private Timestamp create_time;
	private Timestamp update_time;
	private Timestamp payment_time;
	private Timestamp consign_time;
	private Timestamp end_time;
	private Timestamp close_time;
	private String shipping_name;
	private String shipping_code;
	private String user_id;
	private String buyer_message;
	private String buyer_nick;
	private String buyer_rate;
	private String receiver_area_name;
	private String receiver_mobile;
	private String receiver_zip_code;
	private String receiver;
	private String invoice_type;
	private String source_type;
	private String seller_id;
	private Timestamp expire;
	private String shipping_content;
	
	public String getShipping_content() {
		return shipping_content;
	}
	public void setShipping_content(String shipping_content) {
		this.shipping_content = shipping_content;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public BigDecimal getPayment() {
		return payment;
	}
	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPost_fee() {
		return post_fee;
	}
	public void setPost_fee(String post_fee) {
		this.post_fee = post_fee;
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
	public Timestamp getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(Timestamp payment_time) {
		this.payment_time = payment_time;
	}
	public Timestamp getConsign_time() {
		return consign_time;
	}
	public void setConsign_time(Timestamp consign_time) {
		this.consign_time = consign_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public Timestamp getClose_time() {
		return close_time;
	}
	public void setClose_time(Timestamp close_time) {
		this.close_time = close_time;
	}
	public String getShipping_name() {
		return shipping_name;
	}
	public void setShipping_name(String shipping_name) {
		this.shipping_name = shipping_name;
	}
	public String getShipping_code() {
		return shipping_code;
	}
	public void setShipping_code(String shipping_code) {
		this.shipping_code = shipping_code;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBuyer_message() {
		return buyer_message;
	}
	public void setBuyer_message(String buyer_message) {
		this.buyer_message = buyer_message;
	}
	public String getBuyer_nick() {
		return buyer_nick;
	}
	public void setBuyer_nick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}
	public String getBuyer_rate() {
		return buyer_rate;
	}
	public void setBuyer_rate(String buyer_rate) {
		this.buyer_rate = buyer_rate;
	}
	public String getReceiver_area_name() {
		return receiver_area_name;
	}
	public void setReceiver_area_name(String receiver_area_name) {
		this.receiver_area_name = receiver_area_name;
	}
	public String getReceiver_mobile() {
		return receiver_mobile;
	}
	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}
	public String getReceiver_zip_code() {
		return receiver_zip_code;
	}
	public void setReceiver_zip_code(String receiver_zip_code) {
		this.receiver_zip_code = receiver_zip_code;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(String invoice_type) {
		this.invoice_type = invoice_type;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public Timestamp getExpire() {
		return expire;
	}
	public void setExpire(Timestamp expire) {
		this.expire = expire;
	}
	public Order(String order_id, BigDecimal payment, String payment_type, String post_fee, String status,
			Timestamp create_time, Timestamp update_time, Timestamp payment_time, Timestamp consign_time,
			Timestamp end_time, Timestamp close_time, String shipping_name, String shipping_code, String user_id,
			String buyer_message, String buyer_nick, String buyer_rate, String receiver_area_name,
			String receiver_mobile, String receiver_zip_code, String receiver, String invoice_type, String source_type,
			String seller_id, Timestamp expire,String shipping_content) {
		this.shipping_content = shipping_content;
		this.order_id = order_id;
		this.payment = payment;
		this.payment_type = payment_type;
		this.post_fee = post_fee;
		this.status = status;
		this.create_time = create_time;
		this.update_time = update_time;
		this.payment_time = payment_time;
		this.consign_time = consign_time;
		this.end_time = end_time;
		this.close_time = close_time;
		this.shipping_name = shipping_name;
		this.shipping_code = shipping_code;
		this.user_id = user_id;
		this.buyer_message = buyer_message;
		this.buyer_nick = buyer_nick;
		this.buyer_rate = buyer_rate;
		this.receiver_area_name = receiver_area_name;
		this.receiver_mobile = receiver_mobile;
		this.receiver_zip_code = receiver_zip_code;
		this.receiver = receiver;
		this.invoice_type = invoice_type;
		this.source_type = source_type;
		this.seller_id = seller_id;
		this.expire = expire;
	}
	public Order() {
	}
	
}
