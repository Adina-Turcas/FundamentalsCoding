import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu valoarea lui a : ");
        a = scanner.nextInt();
        System.out.println("Introdu valoarea lui b : ");
        b = scanner.nextInt();
        System.out.println("Introdu valoarea lui c : ");
        c = scanner.nextInt();
        int root = (b*b) - (4*a*c);
        if (root<0){
            System.out.println("Delta negatve");
            return;
        }
        double x1= (-b-Math.sqrt(root))/(2*a);
        double x2= (-b+Math.sqrt(root))/(2*a);
        System.out.println("Valoarea lui x1 este :"+x1);
        System.out.println("Valoarea lui x2:" + x2);

    }
}
