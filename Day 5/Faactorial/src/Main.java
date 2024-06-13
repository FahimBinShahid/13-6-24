
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int i = 1;
        int fact = 1;
        do {

            fact = fact * i;
            i++;
        }
        while (i <= number);


            System.out.print("Factorial of " + number + " is " + fact);


        }
    }
