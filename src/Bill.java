import java.util.*;

class Bill {
	private float amount;
	private boolean paid;
	
	public Bill(float amount_, boolean paid_){
		this.amount = amount_;
		this.paid = paid_;
	}
	public Bill(){
		this.amount = 0.0f;
		this.paid = false;		
	}
	public void setAmount(float amount_){
		this.amount = amount_;
	}
	public float getAmount(){
		return this.amount;
	}
	public void setPaid(boolean paid_){
		this.paid = paid_;
	}
	public boolean getPaid(){
		return this.paid;
	}
}
