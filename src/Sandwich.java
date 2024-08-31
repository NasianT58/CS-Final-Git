import java.util.Scanner;
public class Sandwich {
	private String bread;
	private String vegetables;
	private String meat;
	private double price;
	
	public Sandwich() {
		bread = "";
		vegetables = "";
		meat = "";
		price = 0.0;
	}
	
	public void displayBread() {
		System.out.println("=== Select Sandwich Bread: ===");
		System.out.println("1. White Bread: $1.50");
		System.out.println("2. Wheat Bread: $1.60");
		System.out.println("3. French Bread: $1.80");
		System.out.println("4. Organic Bread: $2.00");
	}
	
	public void selectBread(int n) {
		switch(n) {
			case 1:
				bread = "White Bread";
				price += 1.5;
				break;
			case 2:
				bread = "Wheat Bread";
				price += 1.6;
				break;
			case 3: 
				bread = "French Bread";
				price += 1.8;
				break;
			case 4:
				bread = "Organic Bread";
				price += 2.0;
				break;
			default:
				System.out.println("Not an Option");
		}
	}
	
	public String getBread() {
		return bread;
	}
	
	//----------------------------------------Vegetables-----------------------------------------------
	
	public void displayVegetables() {
		System.out.println("=== Select Sandwich Vegetables: ===");
		System.out.println("1. Red Onions $0.05");
		System.out.println("2. Olives $0.10");
		System.out.println("3. Pickles $0.10");
		System.out.println("4. Lettuce $0.20");
		System.out.println("5. Green Peppers $0.25");
		System.out.println("6. Tomatoes $0.30");
		System.out.println("7. Cheese $0.50");
		System.out.println("8. Quit Vegetable Selection");
	}
	
	public void selectVegetable() {
		String hold;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		do {
			switch(num) {
			case 1:
				hold = "Red Onions";
				vegetables += hold + ", ";
				price += 0.05;
				break;
			case 2:
				hold = "Olives";
				vegetables += hold + ", ";
				price += 0.10;
				break;
			case 3:
				hold = "Pickles";
				vegetables += hold + ", ";
				price += 0.10;
				break;
			case 4:
				hold = "Lettuce";
				vegetables += hold + ", ";
				price += 0.20;
				break;
			case 5:
				hold = "Green Peppers";
				vegetables += hold + ", ";
				price += 0.25;
				break;
			case 6:
				hold = "Tomatoes";
				vegetables += hold + ", ";
				price += 0.30;
				break;
			case 7:
				hold = "Cheese";
				vegetables += hold + ", ";
				price += 0.50;
				break;
			case 8:
				System.out.println("You Quit");
				break;
			default:
				System.out.println("Invalid Output");
			}
			System.out.println("");
			displayVegetables();
			System.out.println("Select Vegetable");
			num = input.nextInt();
			
		} while (num >= 1 && num < 8);
	}
	
	public String getVegetable() {
		return vegetables;
	}
	
	
	//---------------------------------------Meat--------------------------------------------------
	
	public void displaySandMeat() {
		System.out.println("1. Ham $1.0");
		System.out.println("2. Roasted Chicken Breast $1.10");
		System.out.println("3. Turkey Breast $1.20");
		System.out.println("4. Roast Beef $1.50");
		System.out.println("5. Quit Meat Selection");
	}
	
	public void selectMeat(int n) {
		switch(n) {
		case 1:
			meat = "Ham";
			price += 1.0;
			break;
		case 2:
			meat = "Roasted Chicken Breast";
			price += 1.10;
			break;
		case 3:
			meat = "Turkey Breast";
			price += 1.20;
			break;
		case 4:
			meat = "Roast Beef";
			price += 1.50;
			break;
		case 5:
			break;
		default:
			System.out.println("Wrong Input");
		}
	}
	
	public String getMeat() {
		return meat;
	}
	
	public double getPrice() {
		return price;
	}

}
