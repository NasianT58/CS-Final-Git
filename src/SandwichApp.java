import java.io.IOException;
import java.text.DateFormat;
import java.util.InputMismatchException;
import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;
public class SandwichApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Nathan Tran Final Project CS 1400
		
		Sandwich order = new Sandwich();
		Order customer = new Order();
		Scanner input = new Scanner(System.in);
		
		//-------------------------------------------------------------------------------------
		
		order.displayBread();
		
		System.out.println("Select Bread [1,4]");
		
		int breadNum = input.nextInt();
		
		order.selectBread(breadNum);
		
		order.displayVegetables();
		
		System.out.println("Select Vegetables");
		
		order.selectVegetable();
		
		order.displaySandMeat();
		
		System.out.println("Select Meat");
		
		int meatOrder = input.nextInt();
		
		input.nextLine();
		
		order.selectMeat(meatOrder);
		
		
		//---------------------------------------------------------------------
		
		
		System.out.println("Enter Name");
		
		String cName = input.nextLine();
		
		customer.enterName(cName);
		
		
		System.out.println(customer.getTime());
		System.out.println("Order: " + customer.getTime() + " " + customer.getName() + ", " + order.getBread() + ", " + order.getVegetable() + order.getMeat());
		System.out.println("Total Price: " + order.getPrice());
		
		SandwichIO.writeOrderToFile(customer, order);
		
		
		System.out.println("Continue to order another sandwich? (y/n)");
		
		char order2 = input.next().charAt(0);
		
		//---------------------------------------------------------------------------------------------
		
		while (order2 == 'y' || order2 == 'Y') {
			order.displayBread();
			
			System.out.println("Select Bread [1,4]");
			
			breadNum = input.nextInt();
			
			order.selectBread(breadNum);
			
			order.displayVegetables();
			
			System.out.println("Select Vegetables");
			
			order.selectVegetable();
			
			order.displaySandMeat();
			
			System.out.println("Select Meat");
			
			meatOrder = input.nextInt();
			
			input.nextLine();
			
			order.selectMeat(meatOrder);
			
			
			
			
			//---------------------------------------------------------------------
			
			
			System.out.println("Enter Name");
			
			cName = input.nextLine();
			
			customer.enterName(cName);
			
			System.out.println(customer.getTime());
			System.out.println("Order: " + customer.getTime() + " " + customer.getName() + ", " + order.getBread() + ", " + order.getVegetable() + order.getMeat());
			System.out.println("Total Price: " + order.getPrice());
						
			SandwichIO.writeOrderToFile(customer, order);

			System.out.println("Continue to order another sandwich? (y/n)");
		

			order2 = input.next().charAt(0);
		}


		
		
		
		

	}

}
