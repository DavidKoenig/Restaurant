import java.util.*;

public class Restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu newMenu;
		newMenu = new Menu();
//		newMenu.printMenu();
		
		TableList tables = new TableList();
		for(int index = 0; index <= 5; ++index) {
			tables.addTableItem();
		}
		
	}

}
