<<<<<<< HEAD
=======
import java.util.*;

>>>>>>> 1be6cda86cb106d104ed5958c397b368a8569ff1
class Waiter {
	private boolean busy;
	private Menu menu;
	private List<Menu> bill; 
	public Waiter(){
		this.busy = false;
		menu = new Menu();
		bill = new ArrayList();
		
	}
	public void setBusy(boolean busy_){
		this.busy = busy_;
	}
	public boolean getBusy(){
		return this.busy;
	}
	
	public void printMenu()
	{
		menu.printList();
	}
	
	public void getOrder(int order_[])
	{
		int length = order_.length;
		for(int index = 0; index <= length; index++){
			bill.add(index, (Menu) menu.getMenuItem(order_[index]));
		}
	}
	
}
