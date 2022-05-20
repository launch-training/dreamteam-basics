// Perfect packaga name for us: com.accenture.jumpstart.dreamteam
package dreamteam;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.commandos.AddOnePersonCommando;
import dreamteam.commandos.AddOneTraineeCommando;
import dreamteam.commandos.ExitCommando;
import dreamteam.commandos.PrintFakePeopleCommando;
import dreamteam.commandos.ShowPeopleCommando;

public class AnimalApp {

	
	public static void main(String[] args) {
		
	
		
		
		ShowPeopleCommando showPeopleCommando = new ShowPeopleCommando();
		AddOnePersonCommando aopc = new AddOnePersonCommando();
		AddOneTraineeCommando traineeCommando = new AddOneTraineeCommando();
		ExitCommando exit = new ExitCommando();
		PrintFakePeopleCommando pfpc = new PrintFakePeopleCommando();

		ArrayList<Person> people = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Hello, what do you want to do?");
			String commando = scanner.nextLine();

			// if / else = Control Statement
			if (commando.equals("show")) {
				showPeopleCommando.execute(people);			
			} else if (commando.equals("add")) {
				aopc.execute(people, scanner);
			} else if (commando.equals("add-trainee")) {
				traineeCommando.execute(people, scanner);
			} else if (commando.equals("exit")) {
				exit.execute();
			} else if (commando.equals("show-fake")) {
				pfpc.execute();
			} else {
				System.out.println("I don't know what you are asking me.");
			}
		}
	}
	
}
