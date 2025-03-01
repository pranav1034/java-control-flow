import java.util.Scanner;

public class FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();
        
        
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;  // 5% of salary
            System.out.println("Your bonus is: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}
