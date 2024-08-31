import java.text.DateFormat;
import java.util.Date;

public class Order extends Sandwich{
	private String customer;
	private String time;
	private Sandwich cOrder;
	
	public Order() {
		customer = "";
		time = "";
	}
	
	public Order(String c, String t, Sandwich o) {
		customer = c;
		time = t;
		cOrder = o;
	}
	
	public void enterName(String n) {
		customer = n;
	}
	
	public String getName() {
		return customer;
	}
	
	public String getTime() {
		Date now = new Date();
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		time = defaultDate.format(now);
		return time;
	}
	
	
	public void newOrder(Sandwich order) {
		cOrder = order;
		cOrder = new Sandwich();
	}
	
	

}
