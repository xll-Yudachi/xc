package com.xll.xc.seller.Pojo;

import java.io.Serializable;
import java.sql.Date;

public class TimeEntity implements Serializable{
	private Date startTime;
	private Date endTime;
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public TimeEntity(Date startTime, Date endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public TimeEntity() {
	}
}
