import java.util.Scanner;
import java.util.ArrayList;

public class TransactionLogApplicationMain{

	public static void main (String [] args){

		ArrayList <String> transactions = new ArrayList <> ();
		double accountBalance = 0.0;

		Scanner input = new Scanner (System.in);

		boolean decision = true;
		while (decision == true){
			String mainMenu = """

				Welcome to Transaction Log App
				1. Deposit
				2. Withdraw
				3. Show Transactions
				4. Exit

			""";

			System.out.println(mainMenu);

			int menuChoice = TransactionLogApplication.collectMenuChoice();
			double amount;

			switch(menuChoice){

				case 1:
					
					amount = TransactionLogApplication.depositAmount();

					if (amount <= 0){
						System.out.println("Invalid input, deposit amount must be greater than 0");

					}

					else {
						accountBalance = TransactionLogApplication.deposit(amount, accountBalance, transactions);

					}
					break;

				case 2:
					
					amount = TransactionLogApplication.withdrawAmount();

					if (amount <= accountBalance && amount > 0.0){
						accountBalance = TransactionLogApplication.withdraw(amount, accountBalance, transactions);
					}

					else if (amount > accountBalance){
						System.out.println("Withdrawal failed: insufficient fund");
					}

					else{
						System.out.println("Invalid Input: Amount must be greater than 0");
					}
					break;

				case 3:
					TransactionLogApplication.showTransactions(transactions);
					break;

				case 4:
					System.out.printf("Final Balance: N%.2f%n", accountBalance);
					System.out.println("Thank you for using Transaction Log App");
					decision = false;
					break;

				default:
					System.out.println("Invalid Input");
			}
		}
	}

}