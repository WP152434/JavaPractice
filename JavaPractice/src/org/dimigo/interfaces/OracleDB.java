package org.dimigo.interfaces;

public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Oracle DB ����");
	}

	@Override
	public void search() {
		System.out.println("Oracle DB ��ȸ");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB ����");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB ����");
	}

}
