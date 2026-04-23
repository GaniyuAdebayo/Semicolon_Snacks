

import java.util.Scanner;
public class Times{
	public static void main (String [] args){

	Scanner input = new Scanner (System.in);
	System.out.println("Input time in seconds: ");
	int time = input.nextInt();
	int hour = time/3600;
	int minute = (time%3600)/60;
	int seconds = (time%3600) % 60;

	System.out.printf("%d has %d hours, %d minutes, %d seconds %n", time, hour, minute, seconds);

}

}