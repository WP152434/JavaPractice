package org.dimigo.abstractclass;

import org.dimigo.abstractclass.*;

public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
		
	public SmartPhone() {
		
	}

	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(this.model+"�� ������ �մϴ�.");
	}

	public void turnOff(){
		System.out.println(this.model+"�� ������ ���ϴ�.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone) phone).useAirDrop();
		}
		else{
			((Galaxy) phone).useWirelessCarging();
		}
	}

	public String toString() {
		return "�𵨸� : " + model + ", ������ : " + company + ", ���� : " + price;
	}	
}
