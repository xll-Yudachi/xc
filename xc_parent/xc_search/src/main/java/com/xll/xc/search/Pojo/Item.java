package com.xll.xc.search.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "xc_item", type = "item")
public class Item implements Serializable{
	@Id
	private Long id;
	@Field(index = true,analyzer = "ik_max_word",searchAnalyzer="ik_max_word")
	private String title;	//标题
	
	private BigDecimal price;	//价格
	
	private String image;	//图片
	
	@Field(index = true,analyzer = "ik_max_word",searchAnalyzer="ik_max_word")
	private String seller;	//卖家
	
	private String status;	//审核状态

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
