import java.util.Scanner; 

public class StudentGrade {

	private static Scanner input = new Scanner(System.in);
	private static int numberOfStudents = 0;
	private static int numberOfSubjects = 0;

	private static Student[] students;
	private static Subject[] subjects; 

	private static Student[] sortedStudents;

	public static void main(String[] args){
		
		System.out.println("Enter number of students:");
		numberOfStudents = input.nextInt();
		input.nextLine();

		students = new Student[numberOfStudents];

		System.out.println("Enter number of subjects:");
		numberOfSubjects = input.nextInt();
		input.nextLine();

		subjects = new Subject[numberOfSubjects];

		System.out.println("Prepare to enter all students details");

		for(int counter = 0; counter < numberOfStudents; counter++){
			System.out.printf("Enter student %d name: %n", counter+1);
			String name = input.nextLine();

			Student student = new Student();
			student.setName(name);
			students[counter] = student;
		}

		System.out.println("Prepare to enter all subjects details");

		for(int counter = 0; counter < numberOfSubjects; counter++){
			System.out.printf("Enter subject %d name: %n", counter+1);
			String name = input.nextLine();

			Subject subject = new Subject();
			subject.setName(name);
			subjects[counter] = subject;
		}

		for (Student student : students){
			System.out.printf("Entering scores for %s%n", student.getName());

			int[] studentScores = new int[subjects.length];
			
			for (int counter = 0; counter < subjects.length; counter++){
				Subject subject = subjects[counter];
				int studentScore = collectStudentScore(subject);
				studentScores[counter] = studentScore;
			}

			student.setScores(studentScores);
		}


		System.out.println("=".repeat(100));

		System.out.printf("%-10s", "STUDENT");

		for(Subject subject : subjects){
			System.out.printf("%10s", subject.getName());
		}

		System.out.printf("%10s %10s %10s %n", "TOT", "AVE", "POS");

		System.out.println("=".repeat(100));

		for (Student student : students){
			System.out.printf("%-10s", student.getName());

			for (int score : student.getScores()){
				System.out.printf("%10d", score);
			}

			System.out.printf("%10d %10.2f %10d %n", student.getTotalScore(), student.getAverageScore(), 1);
		}

		System.out.println("=".repeat(100));
		System.out.println("=".repeat(100));

		for (int counter = 0; counter < subjects.length; counter++){
			displaySubjectSummary(counter);
		}
	}

	private static int collectStudentScore(Subject subject){
		try {
			System.out.printf("Enter score for %s%n", subject.getName());
			int score = input.nextInt();
			input.nextLine();
			
			if(score < 0 || score > 100){
				throw new RuntimeException("Score should only be between 0 and 100");
			}

			return score;
		} catch(Exception e){
			input.nextLine();
			System.out.printf("Invalid input: %s%n", e.getMessage());
			return collectStudentScore(subject);
		}
	}

	private static void displaySubjectSummary(int subjectIndex){
		Subject subject = subjects[subjectIndex];

		Student highestStudent = students[0];
		Student lowestStudent = students[0];
		int passes = 0;
		int fails = 0;
		int totalScores = 0;

		for (Student student : students){
			int studentScore = student.getScores()[subjectIndex];
			if(studentScore > highestStudent.getScores()[subjectIndex]){
				highestStudent = student;
			}

			if(studentScore < highestStudent.getScores()[subjectIndex]){
				lowestStudent = student;
			}

			totalScore += studentScore;

			int BENCHMARK = 50;

			if(studentScore >= BENCHMARK){
				passes++;
			} else {
				fails++;
			}
		}

		System.out.println("=".repeat(70));
		System.out.println("SUBJECT SUMMARY");
		System.out.printf("%s%n", subject.getName());

		System.out.printf("Highest scoring student is: %s scoring %d%n", highestStudent.getName(), highestStudent.getScores()[subjectIndex]);

		System.out.printf("Lowest Scoring student is: %s scoring %d%n", lowestStudent.getName(), lowestStudent.getScores()[subjectIndex]);

		System.out.printf("Total Score is: %d%n", totalScores);

		System.out.printf("Average score is: %.2f%n", (double) totalScores / numberOfStudents);

		System.out.printf("Number of passes: %d%n", passes);
		System.out.printf("Number of Fails: %d%n", fails);

		System.out.println("=".repeat(70));
		System.out.println();
	}
}

















