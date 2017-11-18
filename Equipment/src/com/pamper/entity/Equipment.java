package com.pamper.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Equipment {
	private Integer id;
	private String model;
	private double price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Equipment(Integer id, String model, double price, Date date) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.date = date;
	}
	public Equipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", model=" + model + ", price=" + price + ", date=" + date + "]";
	}
	

}
