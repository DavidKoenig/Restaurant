
class Drinks extends Supply {
	private boolean alcoholic;
	
	public Drinks(float price_, String name_, String description_,boolean alcoholic_){
		super(price_, name_, description_);
		this.alcoholic = alcoholic_;
	}
	public Drinks(){
		this.alcoholic = false;
	}
	public void setAlcoholic(boolean alcoholic_){
		this.alcoholic = alcoholic_;
	}
	public boolean getAlcoholic(){
		return this.alcoholic;
	}
}
