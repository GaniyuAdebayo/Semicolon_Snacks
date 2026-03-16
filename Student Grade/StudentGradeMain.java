import java.util.Scanner;
public class StudentGradeMain{

	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

		int noOfStudents = StudentGradeMethods.collectInput("Enter number of students: ");

		int noOfSubjects = StudentGradeMethods.collectInput("Enter number of subjects: ");

		System.out.println("Saving >>>>>>>>");
		System.out.println("Saved Successfully");

		int [][] studentDossier = new int [noOfStudents][noOfSubjects + 2];

		for (int rowIndex = 0; rowIndex < noOfStudents; rowIndex++){

			for (int columnIndex = 0; columnIndex < noOfSubjects; columnIndex++){

				System.out.printf("Entering score for student %d%n", rowIndex + 1);
				studentDossier[rowIndex][columnIndex] = StudentGradeMethods.collectStudentScore(columnIndex);
			}

		}

		for (int count = 0; count < noOfStudents; count++){

			studentDossier[count][noOfSubjects + 1] = StudentGradeMethods.totalScore(count, noOfSubjects, studentDossier);
		}

		System.out.println("=".repeat(40 + (noOfSubjects * 15)));

		System.out.printf("%-7s", "STUDENT");

		for (int count = 0; count < noOfSubjects; count++){

			System.out.printf("%10s %d", "Subject", count + 1);
		}

		System.out.printf("%8s%12s%12s%n", "Total", "Average", "Position");

		System.out.println("=".repeat(40 + (noOfSubjects * 15)));
	
		System.out.println();

		for (int count = 0; count < noOfStudents; count++){

			System.out.printf("%3s %d", "Student", count+1);

			for (int nCount = 0; nCount < noOfSubjects; nCount++){

				System.out.printf("%7s%d", " ", studentDossier[count][nCount]);
			}

			System.out.printf("%12d", studentDossier[count][noOfSubjects + 1]);
			System.out.printf("%12.2f", (double) studentDossier[count][noOfSubjects + 1]/noOfSubjects);
			System.out.printf("%10d", StudentGradeMethods.studentPosition(noOfStudents, noOfSubjects, count, studentDossier));

			System.out.println();
		}

		System.out.println("=".repeat(40 + (noOfSubjects * 15)));
		System.out.println();
		System.out.println("=".repeat(40 + (noOfSubjects * 15)));


		for (int count = 0; count < noOfSubjects; count++){

			System.out.println("=".repeat(70));
			System.out.println("SUBJECT SUMMARY");
			System.out.printf("Subject %d%n", count + 1);
			System.out.printf("Highest scoring student is: Student %d scoring %d%n", StudentGradeMethods.studentWithHighestScore(count, noOfStudents, studentDossier), StudentGradeMethods.getHighestScore(count, noOfStudents, studentDossier));
			System.out.printf("Lowest Scoring student is: student %d scoring %d%n", StudentGradeMethods.studentWithLowestScore(count, noOfStudents, studentDossier), StudentGradeMethods.getLowestScore(count, noOfStudents, studentDossier));
			System.out.printf("Total Score is: %d%n", StudentGradeMethods.totalSubjectScore(count, noOfStudents, studentDossier));
			System.out.printf("Average score is: %.2f%n", (double) StudentGradeMethods.totalSubjectScore(count, noOfStudents, studentDossier) / noOfStudents);
			System.out.printf("Number of passes: %d%n", StudentGradeMethods.noOfPasses(count, noOfStudents, studentDossier));
			System.out.printf("Number of Fails: %d%n", StudentGradeMethods.noOfFail(count, noOfStudents, studentDossier));
			System.out.println("=".repeat(70));
			System.out.println();

		
		}
		System.out.println("=".repeat(70));
		System.out.println("CLASS SUMMARY");
		System.out.println("=".repeat(70));
		System.out.printf("The best graduating student is: Student %d scoring %d%n%n", StudentGradeMethods.bestStudent(noOfStudents, noOfSubjects, studentDossier), StudentGradeMethods.bestStudentScore(noOfStudents, noOfSubjects, studentDossier));
		System.out.println("!".repeat(70));
		System.out.printf("The worst graduating student is: Student %d scoring %d%n%n", StudentGradeMethods.worstStudent(noOfStudents, noOfSubjects, studentDossier), StudentGradeMethods.worstStudentScore(noOfStudents, noOfSubjects, studentDossier));
		System.out.println("!".repeat(70));
		System.out.println("=".repeat(70));
		System.out.printf("Class total score is: %d%n", StudentGradeMethods.classTotal(noOfStudents, noOfSubjects, studentDossier));
		System.out.printf("Class average score is: %.2f%n", (double) StudentGradeMethods.classTotal(noOfStudents, noOfSubjects, studentDossier)/noOfStudents);
		System.out.println("=".repeat(70));
	}

}