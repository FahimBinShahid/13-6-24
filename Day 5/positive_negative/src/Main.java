import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        double total = 0;
        int count = 0;
        System.out.println("Enter an integer until it is negative");
        int number = sc.nextInt();
        while(number >= 0) {
            if (number > 0) {
                System.out.println("positive");
                positive++;
            } else if (number == 0) {
                System.out.println("Neutral can be posotive also");
            }
            total += number;
            count++;
            System.out.println("Enter a integer, try not to use zero");
            number = sc.nextInt();
        }
        if(number<0){
            negative++;
            System.out.println("Input ended");
        }
        double average = ( count > 0)? total/count : 0;
        System.out.println("The number of positive is"+positive
        +"number of negative is"+ negative + " total number is" +
                total+ " average is "+ average);
    }
}
