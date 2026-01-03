import java.util.ArrayList;

public class TransactionLogApplication{

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

}