package com.project.jsp.model.domain;

import java.sql.Date;
import java.util.List;

public class Post {
	private int id;
	private int memberId;
	private String title;
	private String content;
	private Date date;
	private String idDel;
	
	private String nickName;
	private int commentCount;
	private List<Comment> commentlist;
	public Post() {
	}
	public Post(int id, int memberId, String title, String content, Date date, String idDel, String nickName,
			int commentCount, String thumbnail, List<Comment> commentlist) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.title = title;
		this.content = content;
		this.date = date;
		this.idDel = idDel;
		this.nickName = nickName;
		this.commentCount = commentCount;
		this.commentlist = commentlist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIdDel() {
		return idDel;
	}
	public void setIdDel(String idDel) {
		this.idDel = idDel;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public List<Comment> getCommentlist() {
		return commentlist;
	}
	public void setCommentlist(List<Comment> commentlist) {
		this.commentlist = commentlist;
	}
	
}
