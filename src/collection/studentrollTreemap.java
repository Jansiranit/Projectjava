package collection;

import java.util.TreeMap;

public class studentrollTreemap {
	public static void main(String[] args) {

		TreeMap<Integer, String> student = new TreeMap<Integer, String>();
		student.put(101, "Priya");
		student.put(102, "Rahul");
		student.put(103, "Rohit");
		student.put(104, "Sneha");
		student.put(105, "Rohan");

		Object[] key = student.keySet().toArray();
		for (int i = 0; i < key.length; i++) {
			int stukey = (int) key[i];
			String name = student.get(stukey);
			System.out.println("Roll No      : " + stukey);
			System.out.println("Student Name :" + name);
			System.out.println("===========================");

		}

		if (student.containsKey(103)) {
			System.out.println("Already exsits");
		} else {
			System.out.println("not exsists");
		}
		System.out.println("Roll No      :");
		System.out.println(student.keySet());
		System.out.println("Student Name :");
		System.out.println(student.values());
	}

}
