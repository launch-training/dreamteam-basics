package dreamteam;

public class AnimalApp {

	// This is the starting method:
	public static void main(String[] args) {
	/*
		String name = "Christian";
		String name2 = "Florian";
		String name3 = "Minh";
		String name4 = "Tanja";
		String name5 = "Deeksha";
		
		System.out.println("Hello " + name);
		System.out.println("Hello " + name2);
		System.out.println("Hello " + name3);
		System.out.println("Hello " + name4);
		System.out.println("Hello " + name5);
	*/	
		
		/*
		String[] names = new String[] { 
				"Christian", "Florian", "Minh", "Tanja", "Deeksha" };
		*/
		
		String xyz = "asdfasdf";
		String[] names = args;
		int x = 0;
		
		if (dbl == dbl2) {
			System.out.println("THIS IS THE SAME");
		} else {
			System.out.println("THIS IS NOT THE SAME");
		}
		
		// Foreach
		for (String name : names) {
			System.out.println("Hello " + name);
			x = x + 1;
		}
		
		System.out.println("This code run " + x + " times");
		
		// If/else
		if (x > 10) {
			System.out.println("x > 10");
		} else {
			System.out.println("x < 10");
		}
		
	}
	
}
