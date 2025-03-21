package com.ay.bean;

import java.io.Serializable;

public class BookBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name , author;
	private Float price;
	
	
	public BookBean() {
		super();
	}
	public BookBean(Integer id, String name, String author, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";}
	
}
