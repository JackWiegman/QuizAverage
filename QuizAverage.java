import java.util.Scanner;

public class QuizAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int highScore = 0;
		int lowScore = 101;
		int sumGrades = 0;
		int totalGrades = 0;
		int quizGradeInt;
		String quizGradeString;

		boolean isBlank = false;

		System.out.println("Enter Grades: ");
		quizGradeString = scan.nextLine();
		while (!quizGradeString.isEmpty()) {
			quizGradeInt = Integer.parseInt(quizGradeString);

			sumGrades += quizGradeInt;
			totalGrades += 1;

			if (quizGradeInt > highScore) {
				highScore = quizGradeInt;
			} 
			if (quizGradeInt < lowScore) {
				lowScore = quizGradeInt;
			}
			System.out.println("Enter Grades: ");
			quizGradeString = scan.nextLine();

		}
		sumGrades = (sumGrades - highScore) - lowScore;
		totalGrades -= 2;

		double quizAverage = sumGrades / totalGrades;

		System.out.println("Average quiz grade is a " + quizAverage);

	}

}