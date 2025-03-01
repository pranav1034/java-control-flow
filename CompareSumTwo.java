import java.util.Scanner;

public class CompareSumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n >= 0) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);
            
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
