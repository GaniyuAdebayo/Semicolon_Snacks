import java.util.Scanner;

public class CreditScoreCalculator{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input Account Number: ");
		int accountNumber = input.nextInt();

		System.out.println("Input balance at the beginning of the month: ");
		int accountBalance = input.nextInt();

		System.out.println("Enter total of all items charged by the customer this month: ");
		int itemsCost = input.nextInt();

		System.out.println("Enter total credits applied to customer: ");
		int credits = input.nextInt();

		System.out.println("Enter credit limit: ");
		int creditLimit = input.nextInt();

		int newBalance = accountBalance + itemsCost - credits;

		if (newBalance > creditLimit)
			System.out.println("Creditn limit exceeded");




}

}