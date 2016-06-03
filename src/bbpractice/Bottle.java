package bbpractice;

public class Bottle {
	private int capacity;
	private int quantity;

	Bottle(int maxC){
		this.capacity = maxC;
		this.quantity = 0;
	}
	
	public int quantity(){
		return quantity;
	}
	
	public int remaining() {
		return capacity - quantity;
	}
	
	public void fillFully() {
		quantity = capacity;
	}
	
	public void empty() {
		quantity = 0;
	}
	
	public void pour(Bottle b) {
		quantity += b.quantity;
		if (quantity > capacity) {
			quantity = capacity;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
