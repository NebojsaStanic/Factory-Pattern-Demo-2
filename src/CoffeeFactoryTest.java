
public class CoffeeFactoryTest {

	public static void main(String[] args) {
		
		CoffeeFactory coffeeFactory = new CoffeeFactory();
		coffeeFactory.makeCoffee("small").getPrice();
		coffeeFactory.makeCoffee("medium").getPrice();
		coffeeFactory.makeCoffee("large").getPrice();

	}

}
