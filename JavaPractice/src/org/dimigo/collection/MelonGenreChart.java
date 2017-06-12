package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args){
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> dance = new ArrayList<Music>();
		List<Music> ballade = new ArrayList<Music>();
		
		System.out.println("-- <<��� �帣�� ��Ʈ>> --");
		ballade.add(new Music("�ȷ�Ʈ", "������"));
		map.put("�߶��", ballade);
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("����?", "��Ͼ�"));
		map.put("��", dance);
		printMap(map);
		
		System.out.println("-- <<�� 2�� �� ����>> --");
		dance.set(1, new Music("SIGNAL", "Ʈ���̽�"));
		map.put("��", dance);
		printMap(map);
		
		System.out.println("-- <<�� 1�� �� ����>> --");
		dance.remove(0);
		map.put("��", dance);
		printMap(map);
		
		System.out.println("-- <<��ü ����Ʈ ����>> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");
			for(int i=0;i<map.get(key).size();i++)
				System.out.println(i+1+". "+map.get(key).get(i));
			System.out.println("");
		}
	}
}
