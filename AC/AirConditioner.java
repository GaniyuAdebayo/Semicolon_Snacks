public class AirConditioner{

	private static boolean statusOfAC = false;
	private static int presentTemperature = 0;

	public static boolean status(){
		return statusOfAC;
	}

	public static void turnOn(){
		statusOfAC = true;
		presentTemperature = 16;
	}

	public static void turnOff(){
		statusOfAC = false;
		presentTemperature = 0;
	}

	public static void increaseTemperature(){
		if(presentTemperature < 30){
			presentTemperature++;
		}
	}

	public static void decreaseTemperature(){
		if(presentTemperature > 16){
			presentTemperature--;
		}
	}

	public static int checkTemperature(){
		return presentTemperature;
	}
	
	public static void reset(){
		statusOfAC = false;
		presentTemperature = 0;
	}

}