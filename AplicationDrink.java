
public class AplicationDrink {

	public static void main(String[] args) {
		
		HotDrink.printInfo();
		SweetDrink.printInfo();

	}
}

class Drink {		
	static String name = "Tea";
	
	static void printInfo ( ) {
		System.out.printf(" - Drink: %3s -\n", name);
	}
}

class HotDrink extends Drink {
	static float temperature = 77.77f;
	
	static void printInfo ( ) {
		Drink.printInfo();
		System.out.printf(" - Temperature: %3.2f -\n", temperature);
	}	
}

class SweetDrink extends Drink {
	static int calories = 200;
	static int sugar = 15;
	
	static void printInfo ( ) {
		Drink.printInfo();
		System.out.printf(" - Calories: %3d -\n", calories);
		System.out.printf(" - Amount of sugar: %3d -\n", sugar);
	}
}