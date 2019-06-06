package com.xll.xc.portal.Pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item_cat")
public class ItemCat implements Serializable {

	@Id
	private Long id; // 类别ID
	private Long parentid; // 父级目录ID
	private String name; // 类别名称
	private Long typeid; // 类型ID

	public ItemCat() {
	}

	public ItemCat(Long id, Long parentid, String name, Long typeid) {
		this.id = id;
		this.parentid = parentid;
		this.name = name;
		this.typeid = typeid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTypeid() {
		return typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

}
