public class TaskFive{

	public static int [] oddIndexScores(int [] classScores){
		int oddCounter = 0;

		for(int count = 0; count < classScores.length; count++){
			if ((count + 1) % 2 != 0)
				oddCounter++;
		}

		int [] oddClassScore = new int[oddCounter];
		int inCount = 0;

		for (int count = 0; count < classScores.length; count++){
			
			if ((count+1) % 2 != 0){
					oddClassScore[inCount] = classScores[count];
					inCount++;
			}

		}

		return oddClassScore;

	}

}