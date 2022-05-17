// Perfect packaga name for us: com.accenture.jumpstart.dreamteam
package dreamteam;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {

	
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		// 15:30
		while (true) {
			System.out.println("Hello, what do you want to do?");
			String commando = scanner.nextLine();

			// if / else = Control Statement
			if (commando.equals("show")) {
				PersonPrinter personPrinter = new PersonPrinter();
				personPrinter.print(people);			
			} else if (commando.equals("add")) {
				System.out.println("What is the name of the person?");
				String personName = scanner.nextLine();

				System.out.println("What is the age of the person?");
				String personAge = scanner.nextLine();
				
				Person p = new Person();
				p.name = personName;
				p.age = Integer.parseInt(personAge);
				
				people.add(p);
			} else if (commando.equals("exit")) {
				System.out.println("goodbye");
				System.exit(0);
			} else if (commando.equals("show-fake")) {
				PersonCreator personCreator = new PersonCreator();
				Person[] persons = personCreator.create();
				PersonPrinter personPrinter = new PersonPrinter();
				personPrinter.print(persons);
			} else {
				System.out.println("I don't know what you are asking me.");
			}
		}
		
	}
}
