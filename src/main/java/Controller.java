import java.util.Scanner;

public class Controller {

    Scanner scan;

    public Controller() {
        scan = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runner();
    }

    public void runner() {

        System.out.println("Would you like to add rubric? Yes or no");
        String option = scan.nextLine();

        if (!option.equalsIgnoreCase("yes"))
            return;

        Rubric studentGradesRubric = new Rubric("Student Grades Rubric");

        studentGradesRubric.addCategory("Design");
        studentGradesRubric.addCategory("Implementation");
        studentGradesRubric.addCategory("Testing");
        studentGradesRubric.addCategory("Documentation");

        option = "Yes";

        while (option.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to add student? Yes or no");
            option = scan.nextLine();
            if (!option.equalsIgnoreCase("yes"))
                break;

            System.out.print("What is the student name? ");
            Criterion student = new Criterion(scan.nextLine());

            int score = 0;
            System.out.print("What is the design score?");
            score = scan.nextInt();
            while (score < 0 || score > 5) {
                System.out.print("Score must be between 0-5, Please enter again: ");
                score = scan.nextInt();
            }
            student.addCriteria(score, 0); // Design

            System.out.print("What is the Implementation score?");
            score = scan.nextInt();
            while (score < 0 || score > 5) {
                System.out.print("Score must be between 0-5, Please enter again: ");
                score = scan.nextInt();
            }
            student.addCriteria(score, 1); // Implementation

            System.out.print("What is the Testing score?");
            score = scan.nextInt();
            while (score < 0 || score > 5) {
                System.out.print("Score must be between 0-5, Please enter again: ");
                score = scan.nextInt();
            }
            student.addCriteria(score, 2); // Testing

            System.out.print("What is the Documentation score?");
            score = scan.nextInt();
            while (score < 0 || score > 5) {
                System.out.print("Score must be between 0-5, Please enter again: ");
                score = scan.nextInt();
            }

            student.addCriteria(score, 3); // Documentation

            studentGradesRubric.addCriterion(student);
            scan.nextLine();
        }

        option = "";
        System.out.println("Do you want to print all rubrics? Yes or no");
        option = scan.nextLine();
        if (option.equalsIgnoreCase("yes"))
            studentGradesRubric.printRubric();
        System.out.println();

    }
}