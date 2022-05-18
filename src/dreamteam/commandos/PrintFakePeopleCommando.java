package dreamteam.commandos;

import dreamteam.Person;
import dreamteam.PersonCreator;
import dreamteam.PersonPrinter;

public class PrintFakePeopleCommando {

	public void execute() {
		PersonCreator personCreator = new PersonCreator();
		Person[] persons = personCreator.create();
		PersonPrinter personPrinter = new PersonPrinter();
		personPrinter.print(persons);
	}
}
// 11:20