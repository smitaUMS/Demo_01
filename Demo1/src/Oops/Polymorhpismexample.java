package Oops;

public class Polymorhpismexample {
    //overloading 
	int a = 10, b= 20;
	
	void sum()
	{
	System.out.println(a+b);
	
	}
	
	void sum(int x , int y) 
	{
		System.out.println(x+y);
	}
	void sum(int x , double y) // different data type
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorhpismexample PO = new Polymorhpismexample();
		PO.sum();
		PO.sum(10, 10);
		
	}

}

