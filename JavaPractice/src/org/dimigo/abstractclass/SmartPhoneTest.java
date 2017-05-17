package org.dimigo.abstractclass;

import org.dimigo.abstractclass.*;

public class SmartPhoneTest {
	public static void main(String[] args){
		SmartPhone[] phone = {
				new IPhone("iPhone 7", "����", 900000),
				new Galaxy("������ S8", "�Ｚ", 800000)
		};
		
		for(int i=0;i<2;i++){
			System.out.println(phone[i]);
			phone[i].turnOn();
			phone[i].pay();
			phone[i].useSpecialFunction(phone[i]);
			phone[i].turnOff();
		}
	}
}
