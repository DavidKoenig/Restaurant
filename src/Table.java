import java.util.ArrayList;
import java.util.List;


public class Table {
	Table nextTable;
	Table lastTable;
	Order tableOrder;
	List<Customer> tableCustomer = new ArrayList<Customer>();
	int tableNumber;
	public Table( int tableNumber_ ) 
	{
		this.tableNumber = tableNumber_;
	}
	public Table() {}
	
	public Table getNextTable() { return this.nextTable; }
	public void setNextTable( Table nextTable_ ) { this.nextTable = nextTable_; }

	public Table getLastTable() { return this.lastTable; }
	public void setLastTable( Table lastTable_ ) { this.lastTable = lastTable_; }

	public int getTableNumber() { return this.tableNumber; }
	public void setTableNumber( int tableNumber_ ) { this.tableNumber = tableNumber_; }
	
	public Order getOrder() { return tableOrder; }
	public void setOrder( Order order_ ) { this.tableOrder = order_; }
	
	public List<Customer> getCustomer() { return tableCustomer; }
	public void newCustomer( Customer newCustomer_ ) { tableCustomer.add(newCustomer_); }
	
	public void addTable( Table nextTable_ )
	{
		this.nextTable = nextTable_;
		nextTable_.setLastTable( this );
	}
}
