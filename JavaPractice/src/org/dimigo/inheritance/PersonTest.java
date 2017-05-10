package org.dimigo.inheritance;

public class PersonTest {
	public static void main(String[] args){
		Person person = new Person("Tom");
		Korean hong = new Korean("ȫ�浿");
		Japanese da = new Japanese("�ٳ�ī");
		Chinese wang = new Chinese("�չ�");
		
		System.out.println(person.toString());
		System.out.println(hong.toString());
		System.out.println(da.toString());
		System.out.println(wang.toString());
		
		person.sayHello();
		hong.sayHello();
		da.sayHello();
		wang.sayHello();

		person.sayBye();
		hong.sayBye();
		da.sayBye();
		wang.sayBye();
	}
}
