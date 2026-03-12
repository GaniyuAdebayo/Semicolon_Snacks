public class AirConditioners{

	private boolean statusOfAC;
	private int presentTemperature;

	public AirConditioners(){
		statusOfAC = false;
		presentTemperature = 0;
	}

	public boolean status(){
		return statusOfAC;
	}

	public void turnOn(){
		statusOfAC = true;
		presentTemperature = 16;
	}

	public void turnOff(){
		statusOfAC = false;
		presentTemperature = 0;
	}

	public void increaseTemperature(){
		if(presentTemperature < 30){
			presentTemperature++;
		}
	}

	public void decreaseTemperature(){
		if(presentTemperature > 16){
			presentTemperature--;
		}
	}

	public int checkTemperature(){
		return presentTemperature;
	}
	
	public void reset(){
		statusOfAC = false;
		presentTemperature = 0;
	}

}