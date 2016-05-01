
public class CoffeeFactory {
	
	public Coffee makeCoffee(String descripton){
		if(descripton == null){
			return null;
		}
		if("small".equalsIgnoreCase(descripton)){
			return new SmallCoffee();
		}
		else if(descripton.equalsIgnoreCase("medium")){
			return new MediumCoffee();
		}
		else if(descripton.equalsIgnoreCase("large")){
			return new LargeCoffee();
		}	
		return null;
	}
}
