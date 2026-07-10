package com.hasan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int pId;
	private String pName;
	private String desc;
	private double price;
	
	public Product(String pName, String desc, double price) {
		super();
		this.pName = pName;
		this.desc = desc;
		this.price = price;
	}
	
//	public Product() {
//		
//	}
//	public Product(int pId, String pName, String desc, double price) {
//		super();
//		this.pId = pId;
//		this.pName = pName;
//		this.desc = desc;
//		this.price = price;
//	}
//	
//	
//	public int getpId() {
//		return pId;
//	}
//	public void setpId(int pId) {
//		this.pId = pId;
//	}
//	public String getpName() {
//		return pName;
//	}
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//	public String getDesc() {
//		return desc;
//	}
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Product [pId=" + pId + ", pName=" + pName + ", desc=" + desc + ", price=" + price + "]";
//	}
}
