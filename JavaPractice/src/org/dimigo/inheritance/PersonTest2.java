package org.dimigo.inheritance;

public class PersonTest2 {
	public static void main(String[] args){
		Person person[] = {
				new Person("Tom"),
				new Korean("ȫ�浿"),
				new Japanese("�ٳ�ī"),
				new Chinese("�չ�")
		};
		
		for(int i=0;i<3;i++){
			greeting(person[i]);
		}
	}
	private static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
	}
}
