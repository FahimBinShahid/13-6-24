
public class Main {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Enter the number");
        int fact = 1;
        int i =1;
        for(i=1; i<= number ; i++){
            fact = fact *i;
        }
        System.out.print("Factorial of "+ number + " is " + fact);
    }
}