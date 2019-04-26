package com.itgenius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_price")
	private double prductPrice;
	@Column(name = "product_qty")
	private int productQty;
	@Column(name = "product_status")
	private int productStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrductPrice() {
		return prductPrice;
	}

	public void setPrductPrice(Double prductPrice) {
		this.prductPrice = prductPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", product_name=" + productName + ", product_price=" + prductPrice + "]";
	}

}
