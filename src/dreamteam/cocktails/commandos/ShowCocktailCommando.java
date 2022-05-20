package dreamteam.cocktails.commandos;

import java.util.ArrayList;

import dreamteam.cocktails.Cocktail;

public class ShowCocktailCommando {

	// Don't do doppelt gemoppelt
	public void execute(ArrayList<Cocktail> cocktails) {
		for (Cocktail cocktail : cocktails) {
			cocktail.printInfo();
		}
	}
	
}
