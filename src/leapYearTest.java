import java.util.Scanner;

public class leapYearTest {
    public static void main(String[] args) {
        System.out.println("Leap Year Test Program");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number Year: ");
        int number = scanner.nextInt();

        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("Is Leap Year");
                } else System.out.println("Not Leap Year");
            } else System.out.println("Is Leap Year");
        } else System.out.println("Not Leap Year");
    }
}
