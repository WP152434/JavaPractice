package org.dimigo.oop;

public class FamilyMember {
	static private int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}
	
	static public void printMemberCnt(){
		System.out.println("���� �� �ο� �� : "+memberCnt+" ��");
	}
}
