package day1;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> HM = new HashMap<Integer, String>();
		
		HM.put(1, "sk");
		HM.put(2, "pk");
		HM.put(3, "pk");  // duplicate value allowed 
		HM.put(4, "sk");
		HM.put(4, "smita");//duplicate int collect new or last one value 
		
		System.out.println(HM);
		System.out.println(HM.get(2));
		System.out.println(HM.get(4));
		
	}

}
