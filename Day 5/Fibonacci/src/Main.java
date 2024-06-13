public class Main {
    public static void main(String[] args) {
       int n =10, firstnumber =0, secondnumber = 1;
        System.out.println("Fibonacci series till " + n + " numbers");

        for(int i =1; i<=n; i++){
            System.out.print(firstnumber+ "");
            int nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;
        }


    }
}