import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = scan.nextDouble();

        if (numero1 >= 0) {
            System.out.println("É positivo!");
        } else {
            System.out.println("É negativo!");
        }

    }

}
