import java.util.ArrayList;
import java.util.List;


public class Customer {
	double money;
	List<Food> appetizer = new ArrayList<Food>();	
	List<Food> mainDish = new ArrayList<Food>();
	List<Food> dessert = new ArrayList<Food>();
	
	public void chooseAppetizer( Food appetizer_ ) { appetizer.add( appetizer_ ); }
	public List<Food> getAppetizer() { return appetizer; }
	
	public void chooseMainDish( Food mainDish_ ) { mainDish.add( mainDish_ ); }
	public List<Food> getMainDish() { return mainDish; }
	
	public void chooseDesert( Food dessert_ ) { dessert.add( dessert_ ); }
	public List<Food> getDessert() { return dessert; }
}
