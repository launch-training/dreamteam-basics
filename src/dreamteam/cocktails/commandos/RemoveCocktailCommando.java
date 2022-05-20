package dreamteam.cocktails.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.cocktails.Cocktail;

public class RemoveCocktailCommando {
	public void execute(Scanner scanner, ArrayList<Cocktail> cocktails) {
		System.out.println("What cocktail do you want to remove?");
		String cocktailname = scanner.nextLine();
		
		Cocktail cocktailToRemove = null;
		
		for (Cocktail cocktail : cocktails) {
			if (cocktail.name.equals(cocktailname)) {
				cocktailToRemove = cocktail;
				break;
			}
		}

		if (cocktailToRemove != null) {
			cocktails.remove(cocktailToRemove);
		}
	}
}
