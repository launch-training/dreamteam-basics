package dreamteam.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.Person;
import dreamteam.Trainee;

public class AddOneTraineeCommando {

	public void execute(ArrayList<Person> people, Scanner scanner) {
		// this adds a new person
		System.out.println("What is the name of the person?");
		String personName = scanner.nextLine();

		System.out.println("What is the age of the person?");
		String personAge = scanner.nextLine();
		
		System.out.println("What is the java skill of the person?");
		String javaSkills = scanner.nextLine();
		
		Trainee p = new Trainee();
		p.name = personName;
		p.age = Integer.parseInt(personAge);
		p.javaSkillLevel = Integer.parseInt(javaSkills);
		people.add(p);
	}
}
