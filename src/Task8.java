import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        float firstNumber;
        float secundNumber;
        Scanner scanner = new Scanner(System.in);
        char simbol;
        System.out.println("Introduceti primul numar : ");
        firstNumber = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Introduceti simbolul operatiei matematice (+,-,/,*) : ");
        simbol = scanner.nextLine().charAt(0);
        System.out.println("Introduceti a doilea numae : ");
        secundNumber = scanner.nextFloat();
        scanner.close();

        if (secundNumber == 0 && simbol == '/') {
            System.out.println("Cannot calculate");
            return;
        }
        switch (simbol) {
            case '+': {
                System.out.println("Suma nr : " + (firstNumber + secundNumber));

            }
            case '-': {
                System.out.println("Diferenta nr : " + (firstNumber - secundNumber));

            }
            case '/': {
                System.out.println("Catul impartirii : " + (firstNumber / secundNumber));

            }
            case '*': {
                System.out.println("Produsul inmultirii : " + (firstNumber * secundNumber));
                break;

            }
            default:{
                System.out.println("Invalid value!");
            }

        }


    }
}
