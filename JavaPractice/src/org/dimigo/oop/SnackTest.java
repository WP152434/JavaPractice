package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args){
		Snack a = new Snack("�����", "���", 1100, 2);
		Snack b = new Snack("�ܯ�","ũ���", 1200, 1);
		Snack c = new Snack("��Ϲ���Ĩ","����", 1500, 4);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
