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
		
		// Data Object = POJO = Entity = Business Object
		Person p1 = new Person();
		p1.name = "Christian";
		p1.age = 44;

		Person p2 = new Person();
		p2.name = "Florian";
		p2.age = 26;
		
		Person p3 = new Person();
		p3.name = "Minh";
		p3.age = 27;
		
		Person p4 = new Person();
		p4.name = "Tanja";
		p4.age = 26;
		
		Person p5 = new Person();
		p5.name = "Deeksha";
		p5.age = 28;
		
		Person[] persons = new Person[] { p1, p2, p3, p4, p5 };
		
		// more modern version of looping
		for (Person temp : persons) {
			System.out.println("Hello " + temp.name + ", age " + temp.age);
		}
		
		// Oldschool but also possible:
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Hello " + persons[i].name + ", age " + persons[i].age);
			i++;
		}
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
