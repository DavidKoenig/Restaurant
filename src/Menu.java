public class Menu {
	
	public void initializeMenu()
	{
		Drinks beerRadeberger = new Drinks	(2.70f, "Radeberger", "Pils vom Fass", true);
		Drinks beerVeltins = new Drinks		(2.70f, "Veltins", "Pils vom Fass", true);
		Drinks fanta = new Drinks			(2.00f, "Fanta", "Limonade", false);
		Drinks cola = new Drinks			(2.00f, "Cola", "Limonade", false);
		Drinks sprite = new Drinks			(2.00f, "Fanta", "Limonade", false);
		Drinks water = new Drinks			(1.00f, "Wasser", "aus der Erfurter Quelle", false);
		Drinks herbLiquor = new Drinks		(1.50f, "Kr�uterliqeur", "Nordh�user", true);
		
		Food steakOuFour = new Food			(11.50f, "Steak ou four", "mit Pommes", EFoodKind.valueOf("MAINDISH"), true, false, false, false, false);
		Food rumpsteak = new Food			(15.90f, "Rumpsteak", "mit Wedges und Salat", EFoodKind.valueOf("MAINDISH"), false, true, false, false, true);
		Food schnitzel = new Food			(10.30f, "Schnitzel", "mit Pommes", EFoodKind.valueOf("MAINDISH"), true, false, false, false, false);
		Food beefStock = new Food			(3.90f,  "Rinderbr�he", "hausgemacht", EFoodKind.valueOf("APPETIZER"), false, false, false, false, false);
		Food toastHawai = new Food			(4.60f, "Toast Hawai", "�berbacken", EFoodKind.valueOf("APPETIZER"), false, false, false, false, false);
		Food appleStudel = new Food			(5.20f, "Apfelstrudel", "hausgemacht", EFoodKind.valueOf("DESSERT"), false, false, false, false, false);
		Food iceCream = new Food			(2.70f, "Eiscreme", "Schoko und Vanille", EFoodKind.valueOf("DESSERT"), false, false, false, false, false);
	
	}
	//version with array
	/*
	private Drinks drinks[];
	private Food food[];
	 
	public Menu(){
		drinks = new Drinks[10];
		food = new Food[15];
	}
	
	public void newDrink(float price_, String name_, String description_, int number_, boolean alcoholic_){
		drinks[number_] = new Drinks(alcoholic_, price_, name_, description_);
	}
	public void newFood(float price_, String name_, String description_, int number_, EKind kind_){
		food[number_] = new Food(kind_, price_, name_, description_, number_);
	}
	*/
	
	public void printDrinks(){
		
	}
}
