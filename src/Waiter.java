
class Waiter {
	private boolean busy;
	
	public Waiter(boolean busy_){
		this.busy = busy_;
	}
	public Waiter(){
		this.busy = false;
	}
	public void setBusy(boolean busy_){
		this.busy = busy_;
	}
	public boolean getBusy(){
		return this.busy;
	}
	
	
}
