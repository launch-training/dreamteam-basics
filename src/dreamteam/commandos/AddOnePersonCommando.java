package dreamteam.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.Person;

public class AddOnePersonCommando {

	public void execute(ArrayList<Person> people, Scanner scanner) {
		// this adds a new person
		System.out.println("What is the name of the person?");
		String personName = scanner.nextLine();

		System.out.println("What is the age of the person?");
		String personAge = scanner.nextLine();

		Person p = new Person();
		p.name = personName;
		p.age = Integer.parseInt(personAge);
		people.add(p);
	}
}
