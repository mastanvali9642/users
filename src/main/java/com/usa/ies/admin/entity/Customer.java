package com.usa.ies.admin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int cusId;
	private String customerName;
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private List<CartOrder> orders;
	
	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<CartOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<CartOrder> orders) {
		this.orders = orders;
	}
	

}
