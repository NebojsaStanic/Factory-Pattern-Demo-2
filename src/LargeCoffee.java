
public class LargeCoffee extends Coffee{

	public LargeCoffee() {
		description = "Large coffee";
	}
	@Override
	public void getPrice() {
		System.out.println("Price of a " + description + " is:" +3.5);
	}

}
