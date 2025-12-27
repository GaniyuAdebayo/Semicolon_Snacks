import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutSystem{

	public static void main (String [] args){

		ArrayList <String> items = new ArrayList <>();
		ArrayList <Integer> units = new ArrayList <>();
		ArrayList <Double> price = new ArrayList <>();

		Scanner input = new Scanner (System.in);
		LocalDateTime now = LocalDateTime.now();

		System.out.println("What is the customer's name: ");
		String customerName = input.nextLine();

		String item_purchased;
		int number_of_units;
		double price_per_unit;

		while (true){
	
			System.out.println("What did the user buy?");
			item_purchased = input.nextLine();

			if (items.contains(item_purchased)){
				int position = items.indexOf(item_purchased);
				
				System.out.println("How many pieces?");
				number_of_units = input.nextInt();

				input.nextLine();
				units.set(position, (units.get(position) + number_of_units));
			}

			else{

				items.add(item_purchased);

				System.out.println("How many pieces?");
				number_of_units = input.nextInt();
				units.add(number_of_units);

				System.out.println("How much per unit?");
				price_per_unit = input.nextDouble();
				price.add(price_per_unit);

				input.nextLine();

			}

			System.out.println("Add more items?(yes/no)");
			String continuity = input.nextLine().toLowerCase();

			if (continuity.equals("no"))
				break;
		}

		System.out.println("What is your name?");
		String cashierName = input.nextLine();

		System.out.println("How much discount will customer get?");
		double discount = input.nextDouble();
		
		double total = 0.0;
		for (int nCounter = 0; nCounter < units.size(); nCounter++){

			total += (units.get(nCounter) * price.get(nCounter));

		}

		double totalDiscount = total * (discount/100);
		double VAT = total * 0.175;
		double totalBill = total - totalDiscount + VAT;

		System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
		System.out.printf("Date: %1$te %1$tb %1$tY %tr\n", now, now);
		System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);

		System.out.println("=============================================================");
		System.out.printf("%15s%7s%15s%21s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------");
		
		for (int counter = 0; counter < items.size(); counter++){

			System.out.printf("%15s%7d%16.2f%20.2f%n", items.get(counter), units.get(counter), price.get(counter), (units.get(counter) * price.get(counter)));

		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%38s%20.2f%n", "Sub Total:", total);
		System.out.printf("%38s%20.2f%n", "Discount:", (discount*total));
		System.out.printf("%38s%20.2f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%38s%20.2f%n", "Bill Total:", totalBill);
		System.out.println("=============================================================");
		System.out.printf("%40s %.2f%n", "THIS IS NOT A RECEIPT, KINDLY PAY", totalBill);
		System.out.println("=============================================================");

		System.out.println("\n\nHow much did the customer give to you?");
		double payment = input.nextDouble();

		if (payment >= totalBill){

		System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
		System.out.printf("Date: %1$te %1$tb %1$tY %tr\n", now, now);
		System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);

		System.out.println("=============================================================");
		System.out.printf("%15s%7s%15s%21s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------");
		
		for (int counter = 0; counter < items.size(); counter++){

			System.out.printf("%15s%7d%16.2f%20.2f%n", items.get(counter), units.get(counter), price.get(counter), (units.get(counter) * price.get(counter)));

		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%38s%20.2f%n", "Sub Total:", total);
		System.out.printf("%38s%20.2f%n", "Discount:", (discount*total));
		System.out.printf("%38s%20.2f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%38s%20.2f%n", "Bill Total:", totalBill);
		System.out.printf("%38s%20.2f%n", "Amount Paid:", payment);
		System.out.printf("%38s%20.2f%n", "Balance:", (payment - totalBill));
		System.out.println("=============================================================");
		System.out.printf("%40s%n", "THANK YOU FOR YOUR PATRONAGE");
		System.out.println("=============================================================");


		}

		else{

			System.out.println("Insufficient Funds!")
		}

	}

}