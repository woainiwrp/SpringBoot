package com.wrp.pojo;

public class Users {
	private Integer userid;
	private String username;
	private Integer userage;
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}
	
	public Integer getUserid() {
		return userid;
	}
	public String getUsername() {
		return username;
	}
	public Integer getUserage() {
		return userage;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Integer userid, String username, Integer userage) {
		super();
		this.userid = userid;
		this.username = username;
		this.userage = userage;
	}
	
}
