import java.util.Scanner;

public class CompareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n >= 0) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            
            // Compare results
            if (sum == formulaSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("Mismatch in computation!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
