import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int totalQuestions = 2;

        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) London");
        System.out.println("B) Paris");
        System.out.println("C) Berlin");
        System.out.print("Your answer (A, B, or C): ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is B) Paris");
        }

        System.out.println(); // Separate questions

        System.out.println("Question 2: Which planet is known as the Red Planet?");
        System.out.println("A) Earth");
        System.out.println("B) Mars");
        System.out.println("C) Venus");
        System.out.print("Your answer (A, B, or C): ");
        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is B) Mars");
        }

        System.out.println("Quiz completed! You got " + score + " out of " + totalQuestions + " questions correct.");

        scanner.close();
    }
}
