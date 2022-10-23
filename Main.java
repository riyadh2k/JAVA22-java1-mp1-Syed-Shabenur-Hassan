import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int random;
        int number;
        int tries = 0;
        String guess;

        while(true) {
            random = (int) Math.round(Math.random()*100);
            System.out.println("Guess the random number between 0 and 100 : ");
            do {
                number = scan.nextInt();
                guess = bigSmall(number, random);
                System.out.println(guess);
                tries++;
            }
            while(number != random);
            System.out.println("Correct! You Win!");
            System.out.println("It took you " + tries + " tries");
            System.out.println("---------------------------");
            tries = 0;
        }

    }

    static String bigSmall(int guess, int random) {
        if(guess < random) {
            return "Nope! The number is Higher. Guess again.";
        }
        else {
            return "Nope! The number is Lower. Guess again.";
        }

    }

}