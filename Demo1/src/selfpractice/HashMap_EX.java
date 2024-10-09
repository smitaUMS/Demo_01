package selfpractice;

import java.util.HashMap;

public class HashMap_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap <Integer, String> HM = new HashMap <Integer, String>();
   
   
   
    HM.put(1, "Mumbai");
	HM.put(2, "Nashik");
	HM.put(3, "Pune");   
	HM.put(4, "UK"); 
	HM.put(4, "Mumbai");//duplicate int collect new or last one value // duplicate value allowed but not key
   
	System.out.println(HM);
	System.out.println(HM.get(2));
	System.out.println(HM.get(null));
	}

}
