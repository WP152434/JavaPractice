package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args){
		List<Music> list = new ArrayList<Music>();
		System.out.println("--<<��� ��Ʈ>>--");
		list.add(new Music("I LUV IT", "����"));
		list.add(new Music("����?", "��Ͼ�"));
		printList(list);
		System.out.println("--<<2�� �� �߰�>>--");
		list.add(1, new Music("SIGNAL", "Ʈ���̽�"));
		printList(list);
		System.out.println("--<<3�� �� ����>>--");
		list.set(2, new Music("�ȷ�Ʈ", "������"));
		printList(list);
		System.out.println("--<<2�� �� ����>>--");
		list.remove(1);
		printList(list);
		list.clear();
		System.out.println("--<<��ü ����Ʈ ����>>--");
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int i=0;
		for(Music sing : list){
			i++;
			System.out.println(i+". "+sing.toString());
		}
		System.out.println("");
		return;
	}
}
