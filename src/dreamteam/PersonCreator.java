package dreamteam;

public class PersonCreator {

	public Person[] create() {
		// Data Object = POJO = Entity
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
		
		return persons;
	}
	
}
