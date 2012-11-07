

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
	
	public void addItem( Supply item_ )
	{
		OrderItem newOrderItem = new OrderItem( item_ );
		this.addItem( newOrderItem );
	}
	
	public void addItem( OrderItem newItem_ )
	{
		if( this.tail == null )
			this.head = newItem_;
		else
			this.tail.addOrderItem( newItem_ );
		
		this.tail = newItem_;
		numberItems();
	}
	
	public double sumUp() 
	{
		double sum = 0.0f;
		OrderItem list = head;
		while ( list != null )
		{
			sum = sum + list.getItem().getPrice();
			list = list.getNext();
		}
		
		return sum;
	}
	
	public void numberItems( )
	{
		int index = 0;
		OrderItem currentItem = this.head;
		while( currentItem.getNext() != null )
		{
			++index;
			currentItem.setNumber( index );
			currentItem = currentItem.getNext();
		}
	}
}
