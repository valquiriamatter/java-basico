import java.util.Scanner;

public class TransformarCelsiusEmFarenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double c = scan.nextDouble();

        double f = c * 1.8 + 32;

        System.out.println("A temperatura Celsius: " + c + " em Farenheit é: " + f);

    }

}