import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num =0;
        int digit=0;
        int sum =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        while( num > 0 )
        {
            digit = num % 10;
            sum = sum + digit;

            num = num / 10;
        }
        System.out.println("SumOfDigit : " + sum);
        }
    }