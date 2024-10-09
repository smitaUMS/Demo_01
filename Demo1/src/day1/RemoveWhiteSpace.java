package day1;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sk = " Today is Holiday ";
		String nospace = sk.replaceAll("\\s", "");
		
		System.out.println(nospace);
	}

	
}
