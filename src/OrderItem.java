
public class OrderItem {
	private OrderItem nextItem;
	private OrderItem lastItem;
	private float itemPrice;
	private String[] itemName;
	int itemNumber;	
	public OrderItem( String[] itemName_, float itemPrice_ ) 
	{
		this.itemName = itemName_;
		this.itemPrice = itemPrice_;
		
		if( lastItem == null )
			this.itemNumber = 0;
		else
			this.itemNumber = lastItem.itemNumber + 1;
	}
	public OrderItem() {}
		
	public void setNext( OrderItem next_ ) { this.nextItem = next_; }
	public OrderItem getNext() { return nextItem; }
	public void setLast( OrderItem last_ ) { this.lastItem = last_; }
	public OrderItem getLast() { return lastItem; }
	public float getPrice()	{ return itemPrice; }	
	public void setPrice( float price_ ) { this.itemPrice = price_; }
	public String[] getName() {	return itemName; }	
	public void setName( String[] name_ ) { this.itemName = name_; }
	public void setNumber( int itemNumber_ ) { this.itemNumber = itemNumber_; }
	public int getNumber() { return itemNumber;	}
	
	public void addOrderItem( OrderItem nextItem_ )
	{
		this.nextItem = nextItem_;
		nextItem_.setLast( this );
	}
	
	
}
