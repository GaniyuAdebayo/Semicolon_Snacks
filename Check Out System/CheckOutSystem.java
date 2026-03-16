import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutSystem{

	private static Scanner input = new Scanner (System.in);

	public static void main (String [] args){

		ArrayList <String> items = new ArrayList <>();
		ArrayList <Integer> units = new ArrayList <>();
		ArrayList <Double> price = new ArrayList <>();

		LocalDateTime now = LocalDateTime.now();

		System.out.println("What is the customer's name: ");
		String customerName = input.nextLine();

		String item_purchased;
		int number_of_units;
		double price_per_unit;

		String loopContinuity = "yes";

		while (loopContinuity.equals("yes")){
	
			System.out.println("What did the user buy?");
			item_purchased = input.nextLine();

			if (items.contains(item_purchased)){
				int position = items.indexOf(item_purchased);
				
				number_of_units = CheckoutSystemMethods.collectUnits();

				units.set(position, (units.get(position) + number_of_units));
			}

			else{

				items.add(item_purchased);

				number_of_units = CheckoutSystemMethods.collectUnits();
				units.add(number_of_units);

				price_per_unit = CheckoutSystemMethods.collectPricePerUnit();
				price.add(price_per_unit);
				

			}
		
			loopContinuity = CheckoutSystemMethods.continuityValidation();

		}

		System.out.println("What is your name?");
		String cashierName = input.nextLine();

		double discount = CheckoutSystemMethods.collectDiscount();
		
		double total = 0.0;
		for (int totalCounter = 0; totalCounter < units.size(); totalCounter++){

			total += (units.get(totalCounter) * price.get(totalCounter));

		}

		CheckoutSystemMethods.printInvoice(now, cashierName, customerName, items, units, price, discount, total);
		double amountPaid = CheckoutSystemMethods.collectPayment();
		CheckoutSystemMethods.printReceipt(now, cashierName, customerName, items, units, price, discount, total, amountPaid);

		
	}

	
}