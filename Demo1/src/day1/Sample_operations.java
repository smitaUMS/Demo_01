package day1;

public class Sample_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 100;
		int b = 100;
		
		//Arithemtic Operator 
		
		/*
		System.out.println("Value of" + (a+b));
		System.out.println("Value of" + (a-b));
		System.out.println("Value of" + (a*b));
		System.out.println("Value of" + (a/b));
		System.out.println("Value of" + (a%b));
		*/ 
	
		//Relation/Comparison Operator 
		/*
		System.out.println(a!=b);
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		*/

		// Logical Operator
		
		boolean sk = true;
		boolean pk = false; 
		/*
		System.out.println(sk&&pk);
		System.out.println(sk||pk);
		System.out.println(!pk);
		*/
		
		//Increment and decrement 
		
		/*
		int s = 10;
		System.out.println(s);  //before decrement
		
		s--; 
		System.out.println(s);  // after decrement

		s++;
		System.out.println(s);   // after increment 
		*/
		
		//conditional/ternary 
		/*
		int student = 10;
		String p = (student>0) ? "No Class" : "we have Class";
		System.out.println(p);
		*/
 
		int z= 20;
		int y= 30;
		/*
		int c;
		
		c=z;
		z=y;
		y=c;
		*/
		
		z= z+y;  // 20+30=50
		y= z-y;  // 50-30=20
		z= z-y;  // 50-20=30
		
		System.out.println(z);
		System.out.println(y);
		
	
		
		
	}

}
