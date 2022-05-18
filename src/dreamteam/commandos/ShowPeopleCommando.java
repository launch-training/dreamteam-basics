package dreamteam.commandos;

import java.util.ArrayList;

import dreamteam.Person;
import dreamteam.PersonPrinter;

public class ShowPeopleCommando {

	public void execute(ArrayList<Person> people) {
		PersonPrinter personPrinter = new PersonPrinter();
		personPrinter.print(people);
	}
}
