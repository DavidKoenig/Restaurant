
class Food extends Supply {
	public enum EKind{
		APPETIZER,
		MAINDISH,
		DESSERT
	}
	private EKind kind;
	
	public Food(EKind kind_){
		this.kind = kind_;
	}
	
	public Food(EKind kind_, float price_, String name_, String description_, int number_){
		super(price_, name_, description_, number_);
		this.kind = kind_;
	}
	
	public Food(){
		this.kind = kind.MAINDISH;
	}
}
