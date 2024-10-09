package Oops;

public class Contsructor {

	int ids;
	char grd;
	String nam;
	
	void ABC()
	{
		System.out.println(ids+" "+grd+" "+nam);
	}
	
	void Contsructor(int id, char ga, String name) // local veriables
	{
		ids=id;
		grd=ga;  
		nam=name;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contsructor ME= new Contsructor(101, 'A', "SK");
		ME.ABC();
	}

}
