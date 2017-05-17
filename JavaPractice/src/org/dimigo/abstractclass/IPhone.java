package org.dimigo.abstractclass;

import org.dimigo.abstractclass.SmartPhone;

public class IPhone extends SmartPhone{

	public IPhone() {
		super();
	}

	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	@Override
	public void pay(){
		System.out.println("���� ���̷� ���� �մϴ�.");
	}
	
	public void useAirDrop(){
		System.out.println("AirDrop ����� ����մϴ�.");
	}
}
