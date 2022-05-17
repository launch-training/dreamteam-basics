package dreamteam;

public class PersonPrinter {
	
	public void print(Person[] persons) {
		int x = 0;
		// more modern version of looping
		for (Person temp : persons) {
			System.out.println("Hello " + temp.name + ", age " + temp.age);
			x++;
		}
		
		System.out.println("The method is almost finished");
		
		notifyOfRuns(x);
	}
	
	public void notifyOfRuns(int y) {
		// If/else
		if (y > 5) {
			System.out.println("y > 5");
		} else {
			System.out.println("y < 5");
		}
		
	}
	
}
