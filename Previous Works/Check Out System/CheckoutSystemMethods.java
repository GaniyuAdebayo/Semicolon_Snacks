import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutSystemMethods{

	public static Scanner input = new Scanner (System.in);

	public static double collectPayment(){
		try{
			System.out.println("\n\nHow much did the customer give to you?");
			double payment = input.nextDouble();
			input.nextLine();
			return payment;
		} catch (InputMismatchException e){
			System.out.println("Invalid Input");
			input.nextLine();
			return collectPayment();
		}

	}

	public static int collectUnits(){
		try {
			System.out.println("How many pieces?");
			int unit = input.nextInt();
			input.nextLine();
			return unit;
		} catch(InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return collectUnits();
		}
	}

	public static double collectPricePerUnit(){
		try {
			System.out.println("How much per unit?");
			double price = input.nextDouble();
			input.nextLine();
			return price;
		} catch(InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return collectPricePerUnit();
		}
	}

	public static String continuityValidation(){

			System.out.println("Add more items?(yes/no)");
			String validation = input.nextLine().trim().toLowerCase();

			if (validation.equals("yes") || validation.equals("no")){
				return validation;
			}

			System.out.println("Invalid Input");
			return continuityValidation();
	}

	public static double collectDiscount(){
		try{
			System.out.println("How much discount will customer get?");
			return input.nextDouble();
		} catch (InputMismatchException e){
			System.out.println("Invalid Input!");
			input.nextLine();
			return collectDiscount();
		}

	}

	public static void printInvoice(LocalDateTime now, String cashierName, String customerName, ArrayList <String> items, ArrayList <Integer> units, ArrayList <Double> price, double discount, double total){
		
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
		System.out.printf("%38s%20.2f%n", "Discount:", totalDiscount);
		System.out.printf("%38s%20.2f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%38s%20.2f%n", "Bill Total:", totalBill);
		System.out.println("=============================================================");
		System.out.printf("%40s %.2f%n", "THIS IS NOT A RECEIPT, KINDLY PAY", totalBill);
		System.out.println("=============================================================");

	}


	public static void printReceipt(LocalDateTime now, String cashierName, String customerName, ArrayList <String> items, ArrayList <Integer> units, ArrayList <Double> price, double discount, double total, double payment){

		double totalDiscount = total * (discount/100);
		double VAT = total * 0.175;
		double totalBill = total - totalDiscount + VAT;

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
		System.out.printf("%38s%20.2f%n", "Discount:", totalDiscount);
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

			System.out.println("Insufficient Funds!");
		}

	}


}