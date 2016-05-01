
public class SmallCoffee extends Coffee{

	
	public SmallCoffee() {
		description = "Small coffee";
	}
	@Override
	public void getPrice() {
		System.out.println("Price of a " + description + " is:" +0.5);
	}

}
