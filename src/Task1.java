import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float diametru;
        Scanner scanner = new Scanner(System.in);
        diametru=scanner.nextFloat();
        float pi = 3.14F;
        float perimetru = diametru*pi;
        System.out.println("Valoare perimetru : "+ perimetru);
        scanner.close();

    }

}
