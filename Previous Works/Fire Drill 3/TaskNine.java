public class TaskNine{

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

	public static int minOddIndexScores(int [] classScores){
		int [] oddScores = oddIndexScores(classScores);
		int minScore = oddScores[0];
		for (int count = 1; count < oddScores.length; count++){
			if (oddScores[count] < minScore){
				minScore = oddScores[count];
			}
		}
		return minScore;
	}

}