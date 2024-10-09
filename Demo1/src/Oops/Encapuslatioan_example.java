package Oops;

public class Encapuslatioan_example {      //Wrapping of data & method in single class

	private int accno;
	private String name;
	
	void Setaccno(int accnou)      //set the value (setter)
	{
		accno=accnou;
	}
	
	int Getaccno()                ////get the value (getter)
	{
		return accno;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapuslatioan_example EC = new Encapuslatioan_example();
		EC.Setaccno(100);
		System.out.println(EC.Getaccno());
	}

}
