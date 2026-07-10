package collection;

import java.util.LinkedHashMap;

public class RationCardMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> card = new LinkedHashMap<>();
		card.put(2001, "Aniket");
		card.put(2002, "Rahul");
		card.put(2003, "Priya");
		card.put(2004, "Sneha");
		
		Object[] keys =  card.keySet().toArray();
		for(int i=0; i<keys.length;i++) {
			int currentkey = (int) keys[i];
		String name=	card.get(currentkey);
		System.out.println("Application No :" + currentkey);
		System.out.println("Citizen name   :" + name);
		System.out.println("=====================================");
		
		}
		System.out.println("Application numbers  ");
		System.out.println(card.keySet());
		System.out.println("Citizen name ");
		System.out.println(card.values());
		System.out.println("=====================================");
		int searchkey = 2003;
		System.out.println("Check whether Application Number " +searchkey + " exists");
		if(card.containsKey(searchkey)) {
			System.out.println("Application number already exists");
		}else {
			System.out.println("not exists");
		}
		}
	}


