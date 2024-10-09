package Oops;

public class Thisuse {

	int a;
	int b;       //class veriable 
	
	void sum(int a,int b)
	{
		this.a=a;    // local veriable 
		this.b=b;
		
	}
	
	void display ()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thisuse TU = new Thisuse();
		TU.sum(10, 10);
		TU.display();
		
	}

}
