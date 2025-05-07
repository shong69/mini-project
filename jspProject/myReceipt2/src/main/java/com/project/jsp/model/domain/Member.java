package com.project.jsp.model.domain;

import java.sql.Date;

public class Member {
	private int id;
	private String nickName;
	private String email;
	private Date joinDate;
	
	public Member() {
	}
	public Member(int id, String nickName, String email, Date joinDate) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.email = email;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
