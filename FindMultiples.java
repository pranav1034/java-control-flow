import java.util.Scanner;

public class FindMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiples of " + number + " below 100:");
        for (int i = number; i < 100; i += number) {
            System.out.print(i + " ");
        }
    }
}
