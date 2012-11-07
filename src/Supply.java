import java.lang.String;

class Supply {
	private float price;
	private String name;
	private String description;
	private int number; 	// number on the menu
	
	public Supply(float price_, String name_, String description_, int number_){
		this.price = price_;
		this.name = new String();
		this.name = name_;
		this.description = new String();
		this.description = description_;
		this.number = number_;	
	}
	public Supply(){
		this.price = 0.0f;
		this.name = new String();
		this.description = new String();
		this.number = 0;
	}
	public void setPrice(float price_){
		this.price = price_;		
	}
	public float getPrice(){
		return this.price;
	}
	public void setName(String name_){
		this.name = name_;		
	}
	public String getName(){
		return this.name;
	}
	public void setDescription(String description_){
		this.description = description_;		
	}
	public String getDescription(){
		return this.description;
	}
	public void setNumber(int number_){
		this.number = number_;
	}
	public int getNumbere(){
		return this.number;
	}
}
