public class BackToSenderLLC {

	public static int riderPayout(int no_of_successful_deliveries){

		int basePay = 5000;
		int rate;

		if (no_of_successful_deliveries < 0)
			return -1;

		int category = no_of_successful_deliveries/10;

		switch (category){

			case 10:
			case 9:
			case 8:
			case 7:
				rate = 500;
				break;

			case 6:
				rate = 250;
				break;

			case 5:
				rate = 200;
				break;

			default:
				rate = 160;

		}

		return basePay + rate * no_of_successful_deliveries;

	}
}