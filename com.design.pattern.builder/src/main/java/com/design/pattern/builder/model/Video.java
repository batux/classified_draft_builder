package com.design.pattern.builder.model;

import java.io.Serializable;

public class Video implements Serializable{

	private static final long serialVersionUID = -1145992736340905754L;
	
	private String fileName;
	private String url;
	
	public Video(String fileName, String url) {
		this.fileName = fileName;
		this.url = url;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Video [fileName=" + fileName + ", url=" + url + "]";
	}
	
}
