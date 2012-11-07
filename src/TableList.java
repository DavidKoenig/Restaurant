
public class TableList {
	private Table head;
	private Table tail;
	private int tables;
	public TableList( Table head_ ) 
	{ 
		this.head = head_;
		this.tables = 0;
	}
	public TableList() { this.tables = 0; }
	
	public Table getHead() { return this.head; }
	public Table getTail() { return this.tail; }
	
	public void addTableItem( )
	{
		++this.tables;
		Table newTable = new Table( this.tables );
		this.addTableItem( newTable );
	}
	public void addTableItem( int tableNumber_ )
	{
		Table newTable = new Table( tableNumber_ );
		this.addTableItem( newTable );
	}
	public void addTableItem( Table newTable_ )
	{
		if( this.tail == null )
			this.head = newTable_;
		else this.tail.addTable( newTable_ );
		
		this.tail = newTable_;
	}

	public int size() 
	{
		Table currentTable = getHead();
		int index = 0;
		while( currentTable != null)
		{
			currentTable = currentTable.getNextTable();
			index++;
		}
		return index;
	}
	
	public TableList getList()
	{
		Table currentTable = getHead();
	
		TableList returnList = new TableList();
		returnList.addTableItem( currentTable );

		return returnList;
	}
	
	/*public TableList halfList(SideEnum side)
	{
		TableList workList = getList();
		
		TableList returnList = new TableList();
		
		switch (side) {
		case LEFT:
			Table currentTableLeft = getHead();
			for(int index = 0; index <= workList.size() / 2 - 1; ++index)
			{
				returnList.addTableItem(currentTableLeft.getTableNumber());
				currentTableLeft = currentTableLeft.getNextTable();
			}
			return returnList;
		case RIGHT:
			ListNode currentNodeRight = getLastElement();
			for(int index = workList.size(); index >= (workList.size() / 2) + 1 ; --index)
			{
				returnList.addElement(currentNodeRight.getPayload());
				currentNodeRight = currentNodeRight.getPreviousNode();
			}
			return returnList;
		}
		
		return returnList;
	}
	*/

}
