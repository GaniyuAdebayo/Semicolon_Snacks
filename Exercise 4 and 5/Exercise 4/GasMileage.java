import java.util.Scanner;

public class GasMileage{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Insert miles driven (put 0 to cancel calculation): ");
		int mileage = input.nextInt();

		int tripCounter = 0;
		int totalFuelConsumed = 0;
		int totalDistanceCovered = 0;

		while (mileage != 0){
		
			System.out.println("Enter liters of fuel consumed: ");
			int fuelConsumed = input.nextInt();

			double milesPerLitre = (double) mileage/fuelConsumed;
			tripCounter += 1;

			System.out.printf("Miles per liter for trip %d is %.2f%n", tripCounter, milesPerLitre);

			totalFuelConsumed += fuelConsumed;
			totalDistanceCovered += mileage;

			System.out.println("Insert miles driven (put 0 to cancel calculation): ");
			mileage = input.nextInt();

}

			System.out.printf("The average miles per liter for %d trips is %.2f%n", tripCounter, ((double)totalDistanceCovered/totalFuelConsumed));

}

}