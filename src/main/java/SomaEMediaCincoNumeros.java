import java.util.Scanner;

public class SomaEMediaCincoNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        int media = 0;
        int i;

        for ( i = 1; i <= 5; i++) {

            System.out.println("Digite o " + i + " número");
            num = scan.nextInt();

            soma += num;

            System.out.println("A soma é: " + soma);
        }

        System.out.println("A media é: " + soma/i);


    }




}
