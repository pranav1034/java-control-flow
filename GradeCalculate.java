import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter maximum marks possible: ");
	int marks = sc.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();
	
	int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        }
	else {
	grade = "R";
	}
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
