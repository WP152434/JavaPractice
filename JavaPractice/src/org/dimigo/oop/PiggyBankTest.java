package org.dimigo.oop;

public class PiggyBankTest {
	public static void main(String[] args){
		FamilyMember[] family = new FamilyMember[4];
		family[0] = new FamilyMember("�ƺ�");
		family[1] = new FamilyMember("����");
		family[2] = new FamilyMember("��");
		family[3] = new FamilyMember("������");
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], 1000);
		PiggyBank.printBalance();
	}
}
