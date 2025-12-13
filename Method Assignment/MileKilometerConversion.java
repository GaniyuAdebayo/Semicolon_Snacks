
public class MileKilometerConversion{

	public static void main (String [] args){

		mileToKilometer(1.6);
		kilometerToMile(5.23);

	}
	
	public static void mileToKilometer (double number){

		double value = number * 1.60934;
		System.out.printf("%.2fmile is equivalent to %.2fkm%n", number, value);

	}

	public static void kilometerToMile (double number){

		double value = number * 0.621371;
		System.out.printf("%.2fkm is equivalent to %.2fmiles%n", number, value);

	}
}