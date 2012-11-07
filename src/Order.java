
public class Order {
	private OrderItem head;
	private OrderItem tail;
	public Order( OrderItem head_ ) { this.head = head_; }
	public Order() {}
	
	public OrderItem getHead() { return head; }
	public OrderItem getTail() { return tail; }
	
	public float calculatePrice()
	{
		return 0.0f;
	}
	
	public void addItem( String[] name_, float price_ )
	{
		OrderItem newOrderItem = new OrderItem( name_, price_ );
		this.addItem( newOrderItem );
	}
	
	public void addItem( OrderItem newItem_ )
	{
		if( this.tail == null )
			this.head = newItem_;
		else
			this.tail.addOrderItem( newItem_ );
		
		this.tail = newItem_;
	}
}
