//import java.lang.Math;
public class TabularOutput {

	public static void main (String [] args){

		System.out.println("N\tN2\tN3\tN4");
		
		for (int counter = 1; counter <= 5; counter++){

			System.out.printf("%d\t%.1f\t%.1f\t%.1f%n", counter, (Math.pow(counter, 2)), (Math.pow(counter, 3)), (Math.pow(counter, 4)));

	
}

}

}