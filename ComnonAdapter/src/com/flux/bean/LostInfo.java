package com.flux.bean;

/**
 * 失物招领信息
 * @author wangxl
 *
 */
public class LostInfo {

	private String title;
	private String desc;
	private String time;
	private String phone;
	
	
	public LostInfo() {
		super();
	}
	
	public LostInfo(String title, String desc, String time, String phone) {
		super();
		this.title = title;
		this.desc = desc;
		this.time = time;
		this.phone = phone;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
