package com.example.postapp;

public class Post {
	int id;
	int userid;
	String title;
	String body;
	public Post(int id, int userid, String title, String body) {
		super();
		this.id = id;
		this.userid = userid;
		this.title = title;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	

}
