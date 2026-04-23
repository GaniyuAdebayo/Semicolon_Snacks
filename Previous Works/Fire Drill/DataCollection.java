import java.util.Scanner;

public class DataCollection{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		for (int counter = 1; counter <= 10; counter++){

			System.out.printf("Enter name %d%n", counter);
			String name = input.nextLine();

			System.out.printf("Enter score %d%n", counter);
			int score = input.nextInt();

		}


	}

}