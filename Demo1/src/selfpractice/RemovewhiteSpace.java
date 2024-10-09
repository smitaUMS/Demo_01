package selfpractice;

public class RemovewhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*
		String k = "I Love India";
		
		String nospace = k.replaceAll("\\s", "");   // remove white space 
		
		System.out.println(nospace);
		*/
		
        String k = "I # Love % India &";
		
		String nospace = k.replaceAll("[#%&]*","");     // remove special chr
		
		System.out.println(nospace);
		
		
		
		
	}

}
