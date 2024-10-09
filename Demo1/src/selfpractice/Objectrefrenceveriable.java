package selfpractice;

public class Objectrefrenceveriable {

	String Name;
	String Job ;
	float salary;
	int id;
	
	void display()
	{
		System.out.println(Name);
		System.out.println(Job);
		System.out.println(salary);
		System.out.println(id);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Objectrefrenceveriable obj =  new Objectrefrenceveriable();
		 obj.id = 100;
		 obj.Name = "PK";
		 obj.Job = "Teacher";
		 obj.salary = 102000f;
		 obj.display();
		 
		 

	}

}
