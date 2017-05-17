package org.dimigo.abstractclass;

import org.dimigo.abstractclass.SmartPhone;

public class Galaxy extends SmartPhone{

	public Galaxy() {
		super();
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	@Override
	public void pay(){
		System.out.println("�Ｚ ���̷� ���� �մϴ�.");
	}
	
	public void useWirelessCarging(){
		System.out.println("���� ���� ����� �̿��մϴ�.");
	}
}
