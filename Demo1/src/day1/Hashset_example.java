package day1;

import java.util.HashSet;

public class Hashset_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet myset = new HashSet();
		//adding value/data 
				myset.add(100);
				myset.add(true);
				myset.add('S');
				myset.add("Smita");
				myset.add(10.58);
				myset.add(null);
				myset.add(100);     //duplicate not allowed 
				
				//fetch the all value 
				System.out.println(myset);
				
				//remove value 
				myset.remove('s');
				System.out.println(myset);
				
				//adding data
				myset.add("Banku");
				System.out.println(myset);
				
				//remove all data
				myset.clear();
				System.out.println(myset);
				
				
		
				
	}

}
