package collection;

import java.util.PriorityQueue;

public class hospitalPriorityquene {
	public static void main(String[] args) {
		 PriorityQueue<Integer> patient = new PriorityQueue<Integer>();
		 patient.add(2);
		 patient.add(3);
		 patient.add(6);
		 patient.add(5);
		 patient.add(4);
		 System.out.println("Patient priority quene :" +patient);
		 // remove the small number poll
		 int treatedPatient = patient.poll();
		 System.out.println("Treated patient  : " +treatedPatient);
		 //peek - look at new next head without removing
		 int netpatient = patient.peek();
		 System.out.println("Next patient :" +netpatient);
		 
		 System.out.println("Remaining all patient");
		 while(!patient.isEmpty()) {
			 System.out.println(patient.poll());
		 }
		 
	}

}
