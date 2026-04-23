import java.util.Scanner;
public class Times1{
	public static void main (String [] args){

	Scanner input = new Scanner (System.in);
	System.out.println("Input time in seconds: ");
	int time = input.nextInt();
	int hour = time/3600;
	
	int minute_seconds = time - (hour * 3600);
	int minute = minute_seconds/60;
	int seconds = minute_seconds - (minute * 60);

	System.out.printf("%d has %d hours, %d minutes, %d seconds %n", time, hour, minute, seconds);

}

}