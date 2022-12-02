package com.anshu.core.bean;

public class Address {
	private Integer houseNo;
	private String houseName;
	private String pinCode;
	
	public Address(Integer houseNo, String houseName, String picCode) {
		super();
		this.houseNo = houseNo;
		this.houseName = houseName;
		this.pinCode = picCode;
	}
	@Override
	public String toString() {
		return "\n\thouseNo is   : " + houseNo + "\n\thouseName is : " + houseName 
				+ "\n\tpinCode      : " + pinCode +"\n\t--------------------------" ;
	}
	
	

}
