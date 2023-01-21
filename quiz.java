import java.util.Scanner;

public class IndiaQuiz {

    public static void main(String[] args) {
        int score = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the India Quiz!");

        // Question 1
        System.out.println("\nQ1) What is the capital of India?");
        System.out.println("1) Mumbai");
        System.out.println("2) New Delhi");
        System.out.println("3) Bangalore");
        System.out.println("4) Kolkata");
        int answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is New Delhi.");
        }

        // Question 2
        System.out.println("\nQ2) Which river is known as the " + "lifeline of India" + "?");
        System.out.println("1) Ganges");
        System.out.println("2) Brahmaputra");
        System.out.println("3) Yamuna");
        System.out.println("4) Godavari");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Ganges.");
        }

        // Question 3
        System.out.println("\nQ3) Which Indian state is known as the " + "Land of the Rising Sun" + "?");
        System.out.println("1) Goa");
        System.out.println("2) Kerala");
        System.out.println("3) Gujarat");
        System.out.println("4) Arunachal Pradesh");
        answer = scan.nextInt();
        if (answer == 4) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Arunachal Pradesh.");
        }

        // Question 4
        System.out.println("\nQ4) Which Indian freedom fighter was known as the " + "Father of the Nation" + "?");
        System.out.println("1) Mahatma Gandhi");
        System.out.println("2) Jawaharlal Nehru");
        System.out.println("3) Sardar Patel");
        System.out.println("4) Subhas Chandra Bose");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Mahatma Gandhi.");
        }

              // Question 5
        System.out.println("\nQ5) Which Indian language is the most widely spoken?");
        System.out.println("1) Hindi");
        System.out.println("2) English");
        System.out.println("3) Bengali");
        System.out.println("4) Telugu");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Hindi.");
        }
        
        // Question 6
        System.out.println("\nQ6) Which Indian epic is considered as the national epic of India?");
        System.out.println("1) Ramayana");
        System.out.println("2) Mahabharata");
        System.out.println("3) Bhagavad Gita");
        System.out.println("4) Vedas");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Mahabharata.");
        }
        
        // Question 7
        System.out.println("\nQ7) What is India's national animal?");
        System.out.println("1) Lion");
        System.out.println("2) Tiger");
        System.out.println("3) Elephant");
        System.out.println("4) Peacock");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Tiger.");
        }
        
        // Question 8
        System.out.println("\nQ8) Which Indian mathematician is known as the 'Father of Indian Mathematics'?");
        System.out.println("1) Srinivasa Ramanujan");
        System.out.println("2) Aryabhata");
        System.out.println("3) Brahmagupta");
        System.out.println("4) Bhaskara II");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Aryabhata.");
        }
        
        // Question 9
        System.out.println("\nQ9) What is the currency of India?");
        System.out.println("1) Rupee");
        System.out.println("2) Dollar");
        System.out.println("3) Euro");
        System.out.println("4) Peso");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Rupee.");
        }
        
        // Question 10
        System.out.println("\nQ10) Which Indian leader was the first Prime Minister of independent India?");
        System.out.println("1) Mahatma Gandhi");
        System.out.println("2) Jawaharlal Nehru");
        System.out.println("3) Sardar Patel");
        System.out.println("4) Subhas Chandra Bose");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Jawaharlal Nehru.");
        }

// Final score
        System.out.println("\nYour final score is: " + score + " out of 10");
    }
}
