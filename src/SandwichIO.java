import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class SandwichIO {
	
	public static void writeOrderToFile(Order order, Sandwich order2) throws IOException {
		FileWriter file = new FileWriter("orderline.txt", true);
		PrintWriter print = new PrintWriter(file);
		
		print.print(order.getTime() + " ");
		print.print("Order: " + order.getName() + ", " + order2.getBread() + ", " + order2.getVegetable() + order2.getMeat() + " Price: " + order2.getPrice() + "\n");
		print.close();
		
	}

}
