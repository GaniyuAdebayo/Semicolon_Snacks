import java.util.Scanner;
public class TaskFour{

	static Scanner input = new Scanner (System.in);

	public static int [] evenIndexScores(int [] classScores){
		int evenCounter = 0;

		for(int count = 0; count < classScores.length; count++){
			if ((count + 1) % 2 == 0)
				evenCounter++;
		}

		int [] evenClassScore = new int[evenCounter];
		int inCount = 0;

		for (int count = 0; count < classScores.length; count++){
			
			if ((count+1) % 2 == 0){
					evenClassScore[inCount] = classScores[count];
					inCount++;
			}

		}

		return evenClassScore;

	}

}