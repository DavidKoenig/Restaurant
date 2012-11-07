import java.util.*;

public class Menu {
	
	private List<Supply> menuList = new ArrayList();
	private int index = 0;
	
	public Menu()
	{		
		Drinks beerRadeberger = new Drinks	(2.70f, "Radeberger", "Pils vom Fass", true);
		menuList.add(index, beerRadeberger);
		this.index++;
		
		Drinks beerVeltins = new Drinks		(2.70f, "Veltins", "Pils vom Fass", true);
		menuList.add(index, beerVeltins);
		this.index++;
		
		Drinks fanta = new Drinks			(2.00f, "Fanta", "Limonade", false);
		menuList.add(index, fanta);
		this.index++;
		
		Drinks cola = new Drinks			(2.00f, "Cola", "Limonade", false);
		menuList.add(index, cola);
		this.index++;
		
		Drinks sprite = new Drinks			(2.00f, "Fanta", "Limonade", false);
		menuList.add(index, sprite);
		this.index++;
		
		Drinks water = new Drinks			(1.00f, "Wasser", "aus der Erfurter Quelle", false);
		menuList.add(index, water);
		this.index++;
		
		Drinks herbLiquor = new Drinks		(1.50f, "Kräuterliqeur", "Nordhäuser", true);
		menuList.add(index, herbLiquor);
		this.index++;
		
		Food beefStock = new Food			(3.90f,  "Rinderbrühe", "hausgemacht", EFoodKind.valueOf("APPETIZER"), false, false, false, false, false);
		menuList.add(index, beefStock);
		this.index++;
		
		Food toastHawai = new Food			(4.60f, "Toast Hawai", "überbacken", EFoodKind.valueOf("APPETIZER"), false, false, false, false, false);
		menuList.add(index, toastHawai);
		this.index++;
		
		Food steakOuFour = new Food			(11.50f, "Steak ou four", "mit Pommes", EFoodKind.valueOf("MAINDISH"), true, false, false, false, false);
		menuList.add(index, steakOuFour);
		this.index++;
		
		Food rumpsteak = new Food			(15.90f, "Rumpsteak", "mit Wedges und Salat", EFoodKind.valueOf("MAINDISH"), false, true, false, false, true);
		menuList.add(index, rumpsteak);
		this.index++;
		
		Food schnitzel = new Food			(10.30f, "Schnitzel", "mit Pommes", EFoodKind.valueOf("MAINDISH"), true, false, false, false, false);
		menuList.add(index, schnitzel);
		this.index++;
		
		Food appleStrudel = new Food			(5.20f, "Apfelstrudel", "hausgemacht", EFoodKind.valueOf("DESSERT"), false, false, false, false, false);
		menuList.add(index, appleStrudel);
		this.index++;
		
		Food iceCream = new Food			(2.70f, "Eiscreme", "Schoko und Vanille", EFoodKind.valueOf("DESSERT"), false, false, false, false, false);
		menuList.add(index, iceCream);
		this.index++;
	}
	
	public List getMenu()
	{
		return this.menuList;
	}
	
	public List getMenuItem(int index_)
	{
		return (List) this.menuList.get(index_);
	}
	
	public int getSizeOfMenu()
	{
		return this.index;
	}
	
//	public void printMenu()
//	{
//		for(int indexPrint = 0; indexPrint <= index; indexPrint++){
//			System.out.println("\n" + indexPrint + "\t" + menuList.get(indexPrint).toString());			
//		}
//	}
	
}
