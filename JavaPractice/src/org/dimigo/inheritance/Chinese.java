package org.dimigo.inheritance;

public class Chinese extends Person{

	public Chinese(String name) {
		super(name);
		this.setName(name);
	}
	
	public void sayHello(){
		System.out.println("���Ͽ�");
	}
	
	public void sayBye(){
		System.out.println("¹���");
	}

	public String toString() {
		return "���� �߱���� "+this.getName()+"�Դϴ�.";
	}
}
