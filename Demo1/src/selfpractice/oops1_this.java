package selfpractice;

public class oops1_this {

	int a;
	int b;
	
	void sum (int a, int b)
	
	{
		this.a= a;
	    this.a= b;
	}
	void display()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		oops1_this th = new oops1_this();
		th.sum(20, 20);
		th.display();
	}
	}
}
