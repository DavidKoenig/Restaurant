
public class OrderItem {
	private OrderItem nextItem;
	private OrderItem lastItem;
	private Supply item;
	int itemNumber;	
	public OrderItem( Supply item_ ) 
	{
		item = item_; 
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
	public Supply getItem() {	return item; }	
	public void setItem( Supply item_ ) { item = item_; }
	public void setNumber( int itemNumber_ ) { this.itemNumber = itemNumber_; }
	public int getNumber() { return itemNumber;	}
	
	public void addOrderItem( OrderItem nextItem_ )
	{
		this.nextItem = nextItem_;
		nextItem_.setLast( this );
	}
	
	
}
