package dreamteam.cocktails;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.cocktails.commandos.*;

public class CocktailApp {

	public static void main(String[] args) {
		RemoveCocktailCommando removeCocktailCommando = new RemoveCocktailCommando();
		ShowCocktailCommando showCocktailCommando = new ShowCocktailCommando();
		AddCocktailCommando addCocktailCommando = new AddCocktailCommando();
		AddNonAlcohlicCocktailCommando nonAlcCocktailCommando = new AddNonAlcohlicCocktailCommando();
		ExitCommando exitCommando = new ExitCommando();
		SearchForLetterCommando searchForLetterCommando = new SearchForLetterCommando();
		
		Scanner userInputReader = new Scanner(System.in);
		ArrayList<Cocktail> cocktails = new ArrayList<>();
		
		boolean run = true;
		while (run) {
			System.out.println("What do you want to do?");
			String commando = userInputReader.nextLine();

			if (commando.equals("show")) {
				showCocktailCommando.execute(cocktails);
			} else if (commando.equals("search-letter"))  {
				searchForLetterCommando.execute(userInputReader, cocktails);
			} else if (commando.equals("remove")) { 
				removeCocktailCommando.execute(userInputReader, cocktails);
			} else if (commando.equals("add")) {
				addCocktailCommando.execute(userInputReader, cocktails);
			} else if (commando.equals("add-free")) {
				nonAlcCocktailCommando.execute(userInputReader, cocktails);
			} else if (commando.equals("exit")) {
				exitCommando.execute();
				// System.exit(0); // <-- this breaks the code
				run = false;
			} else {
				System.out.println("I don't know this commando, try exit, add or show");
			}
		}
	}
}
