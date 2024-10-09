package day1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//for (int i= 1; i<=10; i++)
		
		//for (int i =10; i>=0; i--)
		
		//System.out.println(i);
		
		int count = 1;
		for(int i = 1; i <= 2; i++) // outer loop for rows
		{
		    for(int j = 1; j <= 5; j++) // inner loop for columns
		    {
		        System.out.print(count + " "); // print the count variable
		        count++;
		    }
		    System.out.println();
        }
	}
}

	

