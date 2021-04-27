import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base");
        int base = scan.nextInt();

        System.out.println("Digite a potência");
        int potencia = scan.nextInt();

        int resultado = base;

        for(int i=1; i<potencia; i++){
            resultado *= base;
        }

        System.out.println("Resultado " + resultado);

    }


}
