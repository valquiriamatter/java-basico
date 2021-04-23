import java.util.Scanner;

    public class CalcularAreaQuadrado {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite a medida do lado do quadrado!");
            double lado = scan.nextDouble();

            double area = Math.pow (lado, 2);

            System.out.println("A área do quadrado é: " + area);
            System.out.println ("O dobro da área é: " + (area * 2));

        }

    }


