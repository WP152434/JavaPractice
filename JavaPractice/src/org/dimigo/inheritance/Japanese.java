package org.dimigo.inheritance;

public class Japanese extends Person{

	public Japanese(String name) {
		super(name);
		this.setName(name);
	}
	
	public void sayHello(){
		System.out.println("�����̿�");
	}
	
	public void sayBye(){
		System.out.println("��䳪��");
		
	}

	public String toString() {
		return "���� �Ϻ���� "+this.getName()+"�Դϴ�.";
	}
}
