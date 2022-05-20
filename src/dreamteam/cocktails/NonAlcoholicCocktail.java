package dreamteam.cocktails;

public class NonAlcoholicCocktail extends Cocktail {
	
	public boolean fairTrade; 
	public boolean vegan;
	
	public void printInfo() {
		System.out.println(
				"I am " + name + " " + description + 
				". You can enjoy me vegan: " + vegan 
				+ ". And I was traided fair" + fairTrade);
	}
	

}
