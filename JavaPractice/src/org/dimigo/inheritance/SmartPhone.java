package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn(){
		System.out.println(this.model+"의 전원을 켭니다.");
	}

	public void turnOff(){
		System.out.println(this.model+"의 전원을 끕니다.");
	}
	
	public void pay(){
		
	}
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone) phone).useAirDrop();
		}
		else{
			((Galaxy) phone).useWirelessCarging();
		}
	}

	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + price;
	}	
}
