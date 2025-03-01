import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiples of " + number + " below 100:");
        int i = number;
        while (i < 100) {
            System.out.print(i + " ");
            i += number;
        }
    }
}
