import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner num = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(100);
        int numberOfTries = 0;
        int success = 0;
        int guess =0;

        while(success ==0){
            System.out.println("please enter an integer between 1 and 100 inclusive: ");
            guess = num.nextInt();
            numberOfTries++;

            if(guess < 1 || guess > 100)
            {
                System.out.println("Invalid Input");
            }
            else if(guess == computerValue){
                System.out.println("Congratulations you won! Your numbers of tries was: "
                        + numberOfTries + " and the number was: " + computerValue);
            }
            else if ( guess < computerValue){
                System.out.println("Your guess is too low");
            }
            else if(guess > computerValue){
                System.out.println("Your guess is too high!");
            }
        }


    }
}