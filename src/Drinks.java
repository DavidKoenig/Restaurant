
class Drinks extends Supply {
	private boolean alcoholic;
	
	public Drinks(boolean alcoholic_, float price_, String name_, String description_, int number_){
		Supply(price_, name_, description_, number_);
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
