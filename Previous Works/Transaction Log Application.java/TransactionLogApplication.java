import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TransactionLogApplication{

	private static Scanner input = new Scanner (System.in);

	public static double deposit(double amount, double accountBalance, ArrayList <String> transactions){

		accountBalance += amount;

		String transaction = String.format("Deposit: %.2f | New Balance: %.2f", amount, accountBalance);

		System.out.println(transaction);

		transactions.add(transaction);

		return accountBalance;

	}

	public static double withdraw(double amount, double accountBalance, ArrayList <String> transactions){	

		accountBalance -= amount;

		String transaction = String.format("Withdrawal: %.2f | New Balance: %.2f", amount, accountBalance);

		System.out.println(transaction);

		transactions.add(transaction);

		return accountBalance;

	}

	public static void showTransactions(ArrayList <String> transactions){

		if (transactions.size() > 0){

			for (String transaction : transactions){

				System.out.println(transaction);
			}

		}

		else
			System.out.println("No transaction yet.");

	}

	public static int collectMenuChoice(){
		try{
			System.out.print("Enter your choice: ");
			int menuChoice = input.nextInt();
			input.nextLine();
			return menuChoice;
		} catch (InputMismatchException e){
			System.out.println("Invalid Input!");
			input.nextLine();
			return collectMenuChoice();
		}

	}

	public static double depositAmount(){
		try {
			System.out.print("Enter deposit amount: ");
			double amount = input.nextDouble();
			input.nextLine();
			return amount;
		} catch(InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return depositAmount();
		}
	}

	public static double withdrawAmount(){
		try {
			System.out.print("Enter withdrawal amount: ");
			double amount = input.nextDouble();
			input.nextLine();
			return amount;
		} catch(InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return withdrawAmount();
		}
	}

}