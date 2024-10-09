package day1;

import java.util.ArrayList;

public class Arraylist_Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Decleartion an arraylist 
		ArrayList myList= new ArrayList();    //predefine class 
		
		//adding value/data 
		myList.add(100);
		myList.add(true);
		myList.add('S');
		myList.add("Smita");
		myList.add(10.58);
		myList.add(null);
		myList.add(100);     //duplicate allowed 
		
		System.out.println(myList.size());
		
	// fetch the value 
		System.out.println(myList.get(3));
		
		//insert the data
		myList.add(1,"Mumbai");
		myList.add(6, 'M');
		
		// fetch the all value
		System.out.println(myList);
		
		//remove the value
		myList.remove(2);
		System.out.println(myList);
		
		//remove all
		myList.clear();
		System.out.println(myList);
		
		//modify data 
		myList.set(1,"Nashik");
		System.out.println(myList);
		
		
	}

}
