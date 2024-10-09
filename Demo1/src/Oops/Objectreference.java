package Oops;

public class Objectreference {

	String Name;
	String Job;
	float Salary;
	int id;
	
	void display()
	{
		System.out.println(Name);
		System.out.println(Job);
		System.out.println(Salary);
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Objectreference Obj = new Objectreference();
		Obj.id= 101;
		Obj.Job="Trainer";
		Obj.Name="Pravin";
		Obj.Salary=200000;
		Obj.display();
		
		
	}

}
