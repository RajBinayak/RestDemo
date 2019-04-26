package com.example.demoh2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	private int itemId;
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	@ManyToOne
    @JoinColumn(name="order_id")
	private OrderUser order;
	
	
	


	public void setOrder(OrderUser order) {
		this.order = order;
	}
	
	public OrderUser getOrder() {
		return order;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
