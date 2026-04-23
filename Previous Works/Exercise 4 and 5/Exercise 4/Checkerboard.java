public class Checkerboard{

	public static void main (String [] args){

		for (int counter = 1; counter <= 10; counter++){

			if(counter % 2 == 0){

				for (int inCounter = 1; inCounter <= 8; inCounter++){

					System.out.print("*");
					System.out.print(" ");
				}
			}
			else{

				for (int onCounter = 1; onCounter <= 8; onCounter++){

					System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}