import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        CheckingAccount check = new CheckingAccount();

        Scanner in = new Scanner(System.in);

        String choice;
        double moneyAdded;
        double moneySubtracted;

        do
        {
            System.out.println("Deposit");
            System.out.println("Withdraw");
            System.out.println("Balance");
            System.out.println("Exit");
            System.out.println("**********************************************");
            System.out.println("Which operation would you like to use?");
            choice = in.nextLine();

            if(choice.equalsIgnoreCase("Deposit"))
            {
                System.out.println("How much money would you like to deposit?");
                moneyAdded = in.nextDouble();
                check.processDeposit(moneyAdded);
            }

            if(choice.equalsIgnoreCase("Withdraw"))
            {
                System.out.println("How much money would you like to withdraw?");
                moneySubtracted = in.nextDouble();

                check.processCheck(moneySubtracted);
            }
            else if(choice.equalsIgnoreCase("Balance"))
            {
                System.out.printf("$%.2f%n" , check.myBalance);
            }
            else if(choice.equalsIgnoreCase("Exit"))
            {
                System.exit(0);
            }

        }
        while(choice.equalsIgnoreCase("Deposit")||choice.equalsIgnoreCase("Withdraw")||choice.equalsIgnoreCase("Balance"));

        in.close();

    }