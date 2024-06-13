import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 0;

        do {
                System.out.println("Write password:");
                password = sc.nextInt();

        } while (password != 38363 );

        System.out.println("Password accepted.");

    }
}
