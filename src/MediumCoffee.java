
public class MediumCoffee extends Coffee{
	
	public MediumCoffee() {
		description = "Medium coffee";
	}
	@Override
	public void getPrice() {
		System.out.println("Price of a " + description + " is:" +1.5);
	}

}
