package com.budeng.vo;

public class Share{//吐槽分享区
	String imgSource;//图片来源
	String content;//分享内容
	int userId;//可通过ID查看自己的吐槽分享
	
	public String getImgSource() {
		return imgSource;
	}
	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}


}
