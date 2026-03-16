import java.util.Scanner;
public class RiderWage{

	public static void main (String [] args){
		
		
	}

	public static double wageLessThan50Percent(int successfulDelivery){
		double amountPerParcel = 160;
		double BASEPAY = 5000;
		return  (successfulDelivery * amountPerParcel) + BASEPAY;

	}

	public static double wageLessThan60Percent(int successfulDelivery){
		double amountPerParcel = 200;
		double BASEPAY = 5000;
		return  (successfulDelivery * amountPerParcel) + BASEPAY;

	}

	public static double wageLessThan70Percent(int successfulDelivery){
		double amountPerParcel = 250;
		double BASEPAY = 5000;
		return  (successfulDelivery * amountPerParcel) + BASEPAY;

	}

	public static double wageGreaterThanOrEqualTo70Percent(int successfulDelivery){
		double amountPerParcel = 500;
		double BASEPAY = 5000;
		return  (successfulDelivery * amountPerParcel) + BASEPAY;

	}

}