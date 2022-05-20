package dreamteam.cocktails;

public class Cocktail {

	public String name;
	public String description;
	
	public void printInfo() {
		System.out.println("I am " + name + " " + description);
	}

	@Override
	public String toString() {
		return "[" + name + "," + description + "]";
	}
	
}
