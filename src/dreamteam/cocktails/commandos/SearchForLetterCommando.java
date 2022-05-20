package dreamteam.cocktails.commandos;

import java.util.ArrayList;
import java.util.Scanner;

import dreamteam.cocktails.Cocktail;

public class SearchForLetterCommando {
	public void execute(Scanner scanner, ArrayList<Cocktail> cocktails) {
		System.out.println("What is the characters you are looking for?");
		String startsWith = scanner.nextLine();
		
		for (Cocktail cocktail : cocktails) {
			if (cocktail.name.startsWith(startsWith)) {
				cocktail.printInfo();
			}
		}
	}
}
