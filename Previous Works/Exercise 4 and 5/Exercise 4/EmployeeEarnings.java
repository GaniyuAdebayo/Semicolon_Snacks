import java.util.Scanner;
public class EmployeeEarnings{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter number of items 1 sold: ");
		int itemOne = input.nextInt();
		System.out.println("Enter number of items 2 sold: ");
		int itemTwo = input.nextInt();
		System.out.println("Enter number of items 3 sold: ");
		int itemThree = input.nextInt();
		System.out.println("Enter number of items 4 sold: ");
		int itemFour = input.nextInt();
		
		double totalSales = 0.0;
		
		if (itemOne > 0)
			totalSales += (itemOne * 239.99);
		if (itemTwo > 0)
			totalSales += (itemTwo * 129.75);
		if (itemThree > 0)
			totalSales += (itemThree * 99.95);
		if (itemFour > 0)
			totalSales += (itemFour * 350.89);

		System.out.printf("Earning for the week is $%.2f%n", (200 + (totalSales * 0.09)));


}



}