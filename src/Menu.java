
public class Menu {
	private Drinks drinks;
	private Food food;
	
	/*public Menu(float price_, String name_, String description_, int number_, boolean alcoholic_, String foodKind){
		this.drinks(price_, name_, description_, number_, alcoholic_);
	}
	*/
	public void setDrinks(float price_, String name_, String description_, int number_, boolean alcoholic_){
		this.drinks.setPrice(price_);
		this.drinks.setName(name_);
		this.drinks.setDescription(description_);
		this.drinks.setNumber(number_);
		this.drinks.setAlcoholic(alcoholic_);
	}
	
	public void printDrinks(){
		System.out.println("\n Name: " + drinks.getName() + "\nBeschreibung: " + drinks.getDescription() + "\nPreis: " + drinks.getPrice() + "\nNummer: " + drinks.getNumber());
	}
}
