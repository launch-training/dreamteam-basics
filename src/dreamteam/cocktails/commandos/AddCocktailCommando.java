// 10:15
package dreamteam.cocktails.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.cocktails.Cocktail;

public class AddCocktailCommando {
	
	public Cocktail createCocktail(Scanner userInputReader) {
		System.out.println("What is the name of your cocktail?");
		String cocktailName = userInputReader.nextLine();
		
		System.out.println("What is the description of your cocktail?");
		String cocktailDescription = userInputReader.nextLine();
		
		Cocktail c1 = new Cocktail();
		c1.name = cocktailName;
		c1.description = cocktailDescription;
		return c1;
	}
	
	public void execute(Scanner userInputReader, ArrayList<Cocktail> cocktails) {
		Cocktail cocktail = createCocktail(userInputReader);
		
		cocktails.add(cocktail);
	}
}
