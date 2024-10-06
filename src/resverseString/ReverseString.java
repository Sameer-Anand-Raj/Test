package resverseString;

public class ReverseString {

	public static void main(String[] args) {
 
		String str = "my name is sameer";
	    	        long count = str.chars().filter(ch -> ch == 'e').count();
	    	        System.out.println("Total count of 'e': " + count);
		 }
	}

