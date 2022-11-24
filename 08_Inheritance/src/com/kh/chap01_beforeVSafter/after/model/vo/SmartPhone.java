package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	private String mobileAgenct;
	
	public SmartPhone() {

	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgenct) {
		super(brand, pCode, pName, price);
		this.mobileAgenct = mobileAgenct;
		
	}
	
	public void setMobileAgenct(String mobileAgenct) {
		this.mobileAgenct = mobileAgenct;
	}
	
	public String getMobileAgenct() {
		return mobileAgenct;
	}
	
	public String information() {
		return super.information()+", mobileAgenct : "+mobileAgenct;
	}
}
