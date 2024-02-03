import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float weight;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu greutatea in kg : ");
        weight = scanner.nextFloat();
        System.out.println("Introdu inaltimea in cm : ");
        height = scanner.nextInt();
        float heighInMetrs=(float)height/100;
        float bmi = weight/(heighInMetrs*heighInMetrs);
        System.out.println("BMI calculat est : "+ bmi);
        if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("BMI optmal");
        } else {
            System.out.println("BMI not optimal");
        }
        scanner.close();

    }
}
