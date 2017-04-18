package org.dimigo.oop;

public class PiggyBank {
	static private int balance = 0;
	
	static public void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName()+" : "+amount+"�� ����");
		balance += amount;
	}
	
	static public void printBalance(){
		System.out.println("���������� �� �ݾ� "+balance+"��");
	}
}
