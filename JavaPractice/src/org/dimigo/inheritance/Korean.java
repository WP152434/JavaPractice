package org.dimigo.inheritance;

public class Korean extends Person {

	public Korean(String name) {
		super(name);
		this.setName(name);
	}
	
	public void sayHello(){
		System.out.println("�ȳ��ϼ���");
	}
	
	public void sayBye(){
		System.out.println("�ȳ��� �輼��v");
		
	}

	public String toString() {
		return "���� �ѱ���� "+this.getName()+"�Դϴ�.";
	}
}
