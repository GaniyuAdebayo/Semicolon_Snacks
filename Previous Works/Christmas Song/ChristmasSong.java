public class ChristmasSong{

	public static void main (String [] args){

		for (int counter = 1; counter <= 12; counter++){

			switch (counter){
	
				case 1 -> System.out.println("On the first day of christmas");
				case 2 -> System.out.println("On the second day of christmas");
				case 3 -> System.out.println("On the third day of christmas");
				case 4 -> System.out.println("On the fourth day of christmas");
				case 5 -> System.out.println("On the fifth day of christmas");
				case 6 -> System.out.println("On the sixth day of christmas");
				case 7 -> System.out.println("On the seventh day of christmas");
				case 8 -> System.out.println("On the eighth day of christmas");
				case 9 -> System.out.println("On the ninth day of christmas");
				case 10 -> System.out.println("On the tenth day of christmas");
				case 11 -> System.out.println("On the eleventh day of christmas");
				case 12 -> System.out.println("On the twelfth day of christmas");

			}

			System.out.println("My true love sent to me");

			for (int innerCounter = counter; innerCounter >= 1; innerCounter--){

				switch (innerCounter) {

					case 1 -> System.out.println("A partridge in a peer tree");
					case 2 -> System.out.println("Two turtle dove and");
					case 3 -> System.out.println("Three French hens");
					case 4 -> System.out.println("Four calling birds");
					case 5 -> System.out.println("Five golden rings");
					case 6 -> System.out.println("Six geese a-laying");
					case 7 -> System.out.println("Seven swans a-swimming");
					case 8 -> System.out.println("Eight maids a-milking");
					case 9 -> System.out.println("Nine ladies dancing");
					case 10 -> System.out.println("Ten lords a-leaping");
					case 11 -> System.out.println("Eleven pipers piping");
					case 12 -> System.out.println("Twelve drummers drumming");

				}

			}

			System.out.println();
		}

	}
}