// 10:15
package dreamteam.cocktails.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.cocktails.Cocktail;
import dreamteam.cocktails.NonAlcoholicCocktail;

public class AddNonAlcohlicCocktailCommando extends AddCocktailCommando {
	public void execute(Scanner userInputReader, ArrayList<Cocktail> cocktails) {
		
		Cocktail cocktail = createCocktail(userInputReader);
		
		System.out.println("Is this a vegan cocktail?");
		boolean vegan = Boolean.parseBoolean(userInputReader.nextLine());
		
		System.out.println("Is this a fair trade cocktail?");
		boolean fairTrade = Boolean.parseBoolean(userInputReader.nextLine());
		
		NonAlcoholicCocktail c1 = new NonAlcoholicCocktail();
		c1.description = cocktail.description;
		c1.name = cocktail.name;
		c1.fairTrade = fairTrade;
		c1.vegan = vegan;
		
		cocktails.add(c1);
	}
}
