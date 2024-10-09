package Oops;

	class Bank 
	{
		double roi()
		{
		    return 0;
		}
	}
	
	class KOTAK extends Bank
	{
		double roi()
		{
			return 10.50;
		}
	}
	
	class ICICI extends Bank
	{
		double roi()
		{
			return 25;
		}
	}
	
public class Over_riding_example {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
		ICICI IC = new ICICI();
		System.out.println(IC.roi());
		
		KOTAK KT = new KOTAK();
		System.out.println(KT.roi());
		
	}

	}
}
	
