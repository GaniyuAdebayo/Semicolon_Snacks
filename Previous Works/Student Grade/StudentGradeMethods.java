import java.util.Scanner;
public class StudentGradeMethods{

	private static Scanner input = new Scanner (System.in);


	public static int totalScore(int rowIndex, int numberOfSubjects, int [][] studentsDossier){

		int studentTotalScore = 0;
	
		for (int columnIndex = 0; columnIndex < numberOfSubjects; columnIndex++){

			studentTotalScore += studentsDossier[rowIndex][columnIndex];
		}

		return studentTotalScore;
	}

	public static double averageScore(int rowIndex, int numberOfSubjects, int [][] studentsDossier){

		double studentAverageScore = (double) totalScore(rowIndex, numberOfSubjects, studentsDossier) / numberOfSubjects;

		return studentAverageScore;

	}

	public static int studentPosition(int noOfStudents, int noOfSubjects, int rowIndex, int [][] studentsDossier){

		int[] total = new int [noOfStudents];

		for (int count = 0; count < noOfStudents; count++){

			total[count] = studentsDossier.clone()[count][noOfSubjects + 1];
		}

		for (int count = 0; count < total.length; count++){

			int largest = total[count];

			for (int innerCount = count + 1; innerCount < total.length; innerCount++){

				if (total[innerCount] > largest){

					largest = total[innerCount];

					total[innerCount] = total[count];
					total[count] = largest;
					
				}

			}

		}

		for (int count = 0; count < total.length; count++){

			if(total[count] == studentsDossier[rowIndex][noOfSubjects + 1]){

				return count + 1;}

		}

		return -1;
	
	}

	public static int getHighestScore(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int largest = studentsDossier[0][columnIndex];

		for (int count = 1; count < noOfStudents; count++){

			if(studentsDossier[count][columnIndex] > largest)

				largest = studentsDossier[count][columnIndex];
		}

		return largest;
	}

	public static int getLowestScore(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int lowestScore = studentsDossier[0][columnIndex];

		for (int count = 1; count < noOfStudents; count++){

			if(studentsDossier[count][columnIndex] < lowestScore)

				lowestScore = studentsDossier[count][columnIndex];
		}

		return lowestScore;
	}

	public static int totalSubjectScore (int columnIndex, int noOfStudents, int [][] studentsDossier){

		int total = 0;
		for (int count = 0; count < noOfStudents; count++){

			total += studentsDossier[count][columnIndex];
		}

		return total;
	}

	public static int noOfPasses(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int noOfPass = 0;

		for (int count = 0; count < noOfStudents; count++){
			
			if (studentsDossier[count][columnIndex] >= 50)

				noOfPass++;
		}

		return noOfPass;
	}

	public static int noOfFail(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int failNo = 0;

		for (int count = 0; count < noOfStudents; count++){
			
			if (studentsDossier[count][columnIndex] < 50)

				failNo++;
		}

		return failNo;
	}

	public static int studentWithHighestScore(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int studentScore = getHighestScore(columnIndex, noOfStudents, studentsDossier);

		for (int count = 0; count < noOfStudents; count++){

			if (studentsDossier[count][columnIndex] == studentScore)

				return count + 1;
		}

		return -1;
	}

	public static int studentWithLowestScore(int columnIndex, int noOfStudents, int [][] studentsDossier){

		int studentScore = getLowestScore(columnIndex, noOfStudents, studentsDossier);

		for (int count = 0; count < noOfStudents; count++){

			if (studentsDossier[count][columnIndex] == studentScore)

				return count + 1;
		}

		return -1;
	}

	public static int collectStudentScore(int index){
		try {
			System.out.printf("Enter score for %d%n", index + 1);
			int score = input.nextInt();
			//input.nextLine();
			
			if(score < 0 || score > 100){
				throw new RuntimeException("Score should only be between 0 and 100");
			}

			return score;
		} catch(Exception e){
			System.out.printf("Invalid input: %s%n", e.getMessage());
			input.nextLine();
			return collectStudentScore(index);
		}
	}

	public static int bestStudentScore(int noOfStudents, int noOfSubjects, int [][] studentsDossier){

		int largestScore = studentsDossier[0][noOfSubjects + 1];
		for (int count = 1; count < noOfStudents; count++){
			if (studentsDossier[count][noOfSubjects + 1] > largestScore)

				largestScore = studentsDossier[count][noOfSubjects + 1];

		}
		return largestScore;		
	}

	public static int bestStudent(int noOfStudents, int noOfSubjects, int [][] studentsDossier){

		int score = bestStudentScore(noOfStudents, noOfSubjects, studentsDossier);
	
		for (int count = 0; count < noOfStudents; count++){

			if (score == studentsDossier[count][noOfSubjects + 1]){
				return count + 1;
			}

		}

		return -1;
	}

	public static int worstStudentScore(int noOfStudents, int noOfSubjects, int [][] studentsDossier){

		int leastScore = studentsDossier[0][noOfSubjects + 1];
		for (int count = 1; count < noOfStudents; count++){
			if (studentsDossier[count][noOfSubjects + 1] < leastScore)

				leastScore = studentsDossier[count][noOfSubjects + 1];

		}
		return leastScore;		
	}

	public static int worstStudent(int noOfStudents, int noOfSubjects, int [][] studentsDossier){

		int score = worstStudentScore(noOfStudents, noOfSubjects, studentsDossier);
	
		for (int count = 0; count < noOfStudents; count++){

			if (score == studentsDossier[count][noOfSubjects + 1]){
				return count + 1;
			}

		}
		return -1;
	}

	public static int classTotal(int noOfStudents, int noOfSubjects, int [][] studentsDossier){
		int total = 0;

		for (int count = 0; count < noOfStudents; count++){
			total += studentsDossier[count][noOfSubjects + 1];

		}

		return total;

	}

	public static int collectInput(String message){
		try {
			System.out.printf("%s%n", message);
			int inputed = input.nextInt();
			
			if(inputed <= 0){
				throw new RuntimeException("Enter number greater than 0");
			}

			return inputed;
		} catch(Exception e){
			System.out.printf("Invalid input: %s%n", e.getMessage());
			input.nextLine();
			return collectInput(message);
		}
	}


	
}	