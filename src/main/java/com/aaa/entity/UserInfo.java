package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author TeacherChen
 * @description 用户实体类
 * @company AAA软件
 * @classname Qy78
 * 2018-11-21上午9:56:16
 */
public class UserInfo {
	private int id;
	private String username;
	private String password;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:SS")
	private Date createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	

}
