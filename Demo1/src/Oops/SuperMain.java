package Oops;

class Animal
{
	String color = "Black";
		
}

class dog extends Animal
{
	String color = "white";

    void displaycolor()
    {
		System.out.println(super.color);
    }
}
public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog DE = new dog();
		DE.displaycolor();
	}

}
