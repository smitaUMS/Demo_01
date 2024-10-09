package Oops;

class A 
{
	int a = 100;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
		int b = 100;
		
		void display1()
		{
			System.out.println(b);
		}
}

class C extends A
{
	int c = 100;
	
	void display2()
	{
		System.out.println(c);
	}
}


public class Hierarchyinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		C objc = new C ();
		objc.display();
		
		
	}

}
