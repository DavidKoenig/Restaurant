
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
	public Food(){
		this.kind = kind.MAINDISH;
	}
}
