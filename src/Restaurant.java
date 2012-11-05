
public class Restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu[] menuArray = new Menu[10];
		menuArray[0].setDrinks(2.60f, "Radeberger", "Bier-Pils", 1, true);
		
		menuArray[0].printDrinks();
	}

}
