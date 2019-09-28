package com.usa.ies.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address2 {
	@SequenceGenerator(initialValue=9992,allocationSize=1,sequenceName="addressId", name = "addressId")
	@Id
	@GeneratedValue(generator="addressId")
	private int addressId;
	private String streetName;
	private String pincode;
	@OneToOne(mappedBy="address")
	private User2 user2;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
//sys
	
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public User2 getUser2() {
		return user2;
	}
	public void setUser2(User2 user2) {
		this.user2 = user2;
	}
	

}

