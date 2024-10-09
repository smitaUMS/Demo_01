package Oops;

public class ContsructorExample {
	int ids;
	char grd;
	String nam;
	
	void ABC()
	{
		System.out.println(ids+" "+grd+" "+nam);
	}
	
	 ContsructorExample(int id, char ga, String name) // local veriables
	{
		ids=id;
		grd=ga;  
		nam=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContsructorExample CE= new ContsructorExample(101,'A',"SK");
		CE.ABC();
	}

}
