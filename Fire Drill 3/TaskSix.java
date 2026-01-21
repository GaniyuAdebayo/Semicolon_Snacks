public class TaskSix{
	
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

	public static int sumOfIndexScores(int [] classScores){
		
		int [] indexScores = evenIndexScores(classScores);
		int evenSum = 0;

		for (int count = 0; count < indexScores.length; count++){
			evenSum += indexScores[count];
		}
		return evenSum;
	}	
}