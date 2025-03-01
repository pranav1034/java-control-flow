import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (youngestAge == ageAmar) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        if (tallestHeight == heightAmar) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
