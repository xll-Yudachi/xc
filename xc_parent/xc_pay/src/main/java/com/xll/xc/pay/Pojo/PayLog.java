package com.xll.xc.pay.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pay_log")
public class PayLog implements Serializable{
	
	@Id
	private String out_trade_no;
	private Timestamp create_time;
	private Timestamp pay_time;
	private BigDecimal total_fee;
	private String user_id;
	private String transaction_id;
	private String trade_state;
	private String order_list;
	private String pay_type;
	private String seller_id;
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getPay_time() {
		return pay_time;
	}
	public void setPay_time(Timestamp pay_time) {
		this.pay_time = pay_time;
	}
	public BigDecimal getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(BigDecimal total_fee) {
		this.total_fee = total_fee;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getTrade_state() {
		return trade_state;
	}
	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}
	public String getOrder_list() {
		return order_list;
	}
	public void setOrder_list(String order_list) {
		this.order_list = order_list;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public PayLog(String out_trade_no, Timestamp create_time, Timestamp pay_time, BigDecimal total_fee, String user_id,
			String transaction_id, String trade_state, String order_list, String pay_type, String seller_id) {
		this.out_trade_no = out_trade_no;
		this.create_time = create_time;
		this.pay_time = pay_time;
		this.total_fee = total_fee;
		this.user_id = user_id;
		this.transaction_id = transaction_id;
		this.trade_state = trade_state;
		this.order_list = order_list;
		this.pay_type = pay_type;
		this.seller_id = seller_id;
	}
	public PayLog() {
	}
	
}
