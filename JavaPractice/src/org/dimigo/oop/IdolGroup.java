package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] Args){
		String[] groupName = {"���", "2NE1", "�ɽ�����"};
		String[ ][ ] memberName = {
				{"GD", "�¾�", "�뼺", "ž", "�¸�"},
				{"CL", "��ٶ��", "�ں�", "����"},
				{"����", "����", "����", "�ξ�"}
		};
		
		for(int i=0;i<groupName.length;i++){
			System.out.println("<<"+groupName[i]+">>");
			for(int j=0;j<memberName[i].length;j++){
				System.out.println(memberName[i][j]);
			}
		}
	}
}