package Oops;

public class MethodExample {

	int ids;
	char grd;
	String nam;
	
	void ABC()
	{
		System.out.println(ids+" "+grd+" "+nam);
	}
	
	void XYZ(int id, char ga, String name) // local veriables
	{
		ids=id;
		grd=ga;  
		nam=name;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodExample ME= new MethodExample();
		ME.XYZ(101, 'A', "SK");
		ME.ABC();
		
		
		
	}

}
