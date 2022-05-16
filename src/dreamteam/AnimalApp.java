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
		
		// Foreach
		for (String name : names) {
			System.out.println("Hello " + name);
			x = x + 1;
			notifyOfRuns(x);
		}
		
		System.out.println("This code run " + x + " times");
		
		notifyOfRuns(x);
		
	}
	
	public static void notifyOfRuns(int y) {
		// If/else
		if (y > 5) {
			System.out.println("y > 5");
		} else {
			System.out.println("y < 5");
		}
		
	}
	
}
