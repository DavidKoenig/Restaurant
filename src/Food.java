class Food extends Supply {
	private EFoodKind kind;
	private boolean fries;
	private boolean salad;
	private boolean friedPotatoes;
	private boolean beans;
	private boolean wedges;
	
	public Food(float price_, String name_, String description_, EFoodKind kind_, boolean fries_, boolean salad_, boolean friedPotatoes_, boolean beans_, boolean wedges_){
		super(price_, name_, description_);
		this.kind = kind_;
		this.fries = fries_;
		this.salad = salad_;
		this.friedPotatoes = friedPotatoes_;
		this.beans = beans_;
		this.wedges = wedges_;
	}
	public Food(){
		this.kind = EFoodKind.valueOf( "MAINDISH");
		this.fries = false;
		this.salad = false;
		this.friedPotatoes = false;
		this.beans = false;
		this.wedges = false;		
	}
	public void setEFoodKind(EFoodKind kind_){
		this.kind = kind_;
	}
	public EFoodKind getEFoodKind(){
		return this.kind;
	}
	
	public void setFries(boolean fries_){
		this.fries = fries_;
	}
	public boolean getFries(){
		return this.fries;
	}
	
	public void setSalad(boolean salad_){
		this.salad = salad_;
	}
	public boolean getSalad(){
		return this.salad;
	}
	
	public void setFriedPotatoes(boolean friedPotatoes_){
		this.friedPotatoes = friedPotatoes_;
	}
	public boolean getFriedPotatoes(){
		return this.friedPotatoes;
	}
	
	public void setBeans(boolean beans_){
		this.beans = beans_;
	}
	public boolean getBeans(){
		return this.beans;
	}
	
	public void setWedges(boolean wedges_){
		this.wedges = wedges_;
	}
	public boolean getWedges(){
		return this.wedges;
	}
}
