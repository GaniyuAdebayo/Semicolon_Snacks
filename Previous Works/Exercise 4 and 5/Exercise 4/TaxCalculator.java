import java.util.Scanner;
public class TaxCalculator{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);

		for (int counter = 1; counter <= 3; ++counter){

			System.out.println("Enter name: ");
			String name = input.nextLine();

			System.out.println("Enter your monthly earning: ");
			double earning = input.nextDouble();

			double basic = 0;
			double extra = 0;
			double tax = 0;

			if (earning <= 30000){

				tax = 0.15 * earning;
				System.out.printf("Tax on earning of %.2f is %.2f%n", earning, tax);
}
			else {
				basic = 30000;
				extra = earning - basic;
				tax = (0.15 * basic) + (extra * 0.20);
				System.out.printf("Tax on earning of %.2f is %.2f", earning, tax);

}
				
			System.out.println();

}


}
}