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
		String[] names = new String[] { 
				"Christian", "Florian", "Minh", "Tanja", "Deeksha" };	
		
		for (String name : names) {
			System.out.println("Hello " + name);
		}
		
		PersonCreator personCreator = new PersonCreator();
		Person[] persons = personCreator.create();
		
		PersonPrinter personPrinter = new PersonPrinter();
		personPrinter.print(persons);
		
		
		// more modern version of looping
		/*
		for (Person temp : persons) {
			System.out.println("Hello " + temp.name + ", age " + temp.age);
		}
		*/
		
		// Oldschool but also possible:
		/*
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Hello " + persons[i].name + ", age " + persons[i].age);
			i++;
		}
		*/
	}
	
	
}
