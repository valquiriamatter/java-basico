import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da série de Fibonnaci");
        int n = scan.nextInt();

        int primeiroNumero = 1;
        int segundoNumero = 1;
        int proximo;

        for(int i=3; i<= n; i++){
            proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;

            System.out.println("Número: " + proximo);
        }

    }


}
