import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int positiveNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu un nr pozitiv: ");
        positiveNumber = scanner.nextInt();
        for (int i = 1; i <= positiveNumber; i++) {
            if (i % 3 == 0 && 1 % 7 == 0) {
                System.out.println("Fizz si buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}


