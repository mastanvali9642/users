package com.usa.ies.admin.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class CartOrder {

	@Id
	@GeneratedValue
	private int orderId;
	private String orderName;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style="dd/MM/yyyy")
	private Date orderdate;
	@ManyToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="customerId",referencedColumnName="cusId")
	private Customer customer;
	

public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
		
	
	
}
