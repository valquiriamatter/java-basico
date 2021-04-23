import java.util.Scanner;

public class TransformandoMetrosEmCentimetros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a metragem");
        double metragem = scan.nextDouble();

        System.out.println("A medida em Centímetros é: " + metragem * 100);

    }

}