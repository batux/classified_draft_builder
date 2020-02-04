package com.design.pattern.builder.model;

import java.io.Serializable;

public class Option<T> implements Serializable {

	private static final long serialVersionUID = -1826835347324674968L;
	
	private String name;
	private T value;
	
	public Option(String name, T value) {
		this.setName(name);
		this.setValue(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Option [name=" + name + ", value=" + value + "]";
	}
}
