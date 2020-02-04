package com.design.pattern.builder.model;

import java.io.Serializable;

public class Image implements Serializable {

	private static final long serialVersionUID = 9150927710266871319L;
	
	private String fileName;
	private String url;
	
	public Image(String fileName, String url) {
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
		return "Image [fileName=" + fileName + ", url=" + url + "]";
	}
}
