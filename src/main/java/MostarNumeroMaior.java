import java.util.Scanner;

public class MostarNumeroMaior {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o primeiro número");
            double numero1 = scan.nextDouble();

            System.out.println("Digite o segundo número");
            double numero2 = scan.nextDouble();

            if(numero1 > numero2) {
                System.out.println("O maior numero é: " + numero1);
            }else {
                System.out.println("O maior numero é: " + numero2);

            }


        }

    }



