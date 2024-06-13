import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num= 0;
        int reversed = 0;
        System.out.println("Original Number: "  );

        Scanner scanner = new Scanner(System.in);
         num = scanner.nextInt();


        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10;
            reversed = reversed + num%10;;
            num = num / 10;
        }
        System.out.println("Reversed number " + reversed);

    }

}