import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pyramid{

	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Enter pyramid level: ");
		int level = input.nextInt();

		int counter = level * 7;
		for (int count = 1; count <= level; count++){

			System.out.printf("%" + counter + "s", " ");

			counter -= 7;

			for (int number : pyramidLevelOutput(count)){
				System.out.printf("%-7d", number);

			}

			System.out.println();
		}


	}

	public static ArrayList <Integer> pyramidLevelOutput (int level){

		ArrayList <Integer> presentLevel = new ArrayList <Integer> ();

		if (level == 1){
			return new ArrayList <Integer> (List.of(1));
		}

		else{
			ArrayList <Integer> previousLevel = pyramidLevelOutput(level - 1);

			for (int index = 0; index <= (2*level) -2; index++){
				if (index == 0 || index == (2*level) -2){
					presentLevel.add(1);
				}
				else{
					presentLevel.add(previousLevel.get(index-1) * 3);
				}

			}

		}

		return presentLevel;

	}

}