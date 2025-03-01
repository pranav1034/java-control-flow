import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial not defined");
        } else {
            int factorial = 1, i = 1;
            
            while (i <= n) {
                factorial *= i;
                i++;
            }
            
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
