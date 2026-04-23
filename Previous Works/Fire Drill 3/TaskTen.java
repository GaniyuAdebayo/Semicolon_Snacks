public class TaskTen{

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

	public static int maxEvenIndexScores(int [] classScores){
		int [] evenScores = evenIndexScores(classScores);
		int maxScore = evenScores[0];
		for (int count = 1; count < evenScores.length; count++){
			if (evenScores[count] > maxScore){
				maxScore = evenScores[count];
			}
		}
		return maxScore;
	}

}