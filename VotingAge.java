import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can" : "cannot") + " vote.");
    }
}
