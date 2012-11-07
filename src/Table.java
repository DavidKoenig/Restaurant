public class Table {
Table nextTable;
Table lastTable;
int tableNumber;
int numberCustomer;
public Table( int tableNumber_ )
{


}
public Table() {}

public Table getNextTable() { return this.nextTable; }
public void setNextTable( Table nextTable_ ) { this.nextTable = nextTable_; }
public Table getLastTable() { return this.lastTable; }
public void setLastTable( Table lastTable_ ) { this.lastTable = lastTable_; }
public int getTableNumber() { return this.tableNumber; }
public void setTableNumber( int tableNumber_ ) { this.tableNumber = tableNumber_; }
public int getNumberCustomer() { return this.numberCustomer; }
public void setNumberCustomer( int numberCustomer_ ) { this.numberCustomer = numberCustomer_; }

public void addTable( Table nextTable_ )
{
	this.nextTable = nextTable_;
	nextTable_.setLastTable( this );
}
}