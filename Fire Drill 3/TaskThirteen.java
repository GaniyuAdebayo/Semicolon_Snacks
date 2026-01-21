public class TaskThirteen{

	
	
	
	public static void main (String [] args){

		int [] sample = {5, 3, 9, 3, 5, 1, 4, 2, 8};
		int [] sum = swappingNotEvenValue(sample);
		for (int val : sum){
			System.out.printf("%d ", val);
		}

	}


	public static int [] swappingNotEvenValue (int [] classScores){

		int [] clonedScores = new int [classScores.length];

		for (int count = 0; count < clonedScores.length; count += 2){

			if ((count + 1) < clonedScores.length){

				if (classScores[count] % 2 != 0 && classScores[count + 1] % 2 != 0){

					int value = classScores[count + 1];
					clonedScores[count + 1] = classScores[count];
					clonedScores[count] = value;

				}

				else{
					clonedScores[count] = classScores[count];
					clonedScores[count + 1] = classScores[count + 1];
				}
			}

			else{
				clonedScores[count] = classScores[count];
			}

		}

		return clonedScores;
	}
}