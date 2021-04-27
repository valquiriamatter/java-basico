import java.util.Scanner;

public class CincoNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + " número");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O maior número mudou " + maior);
            }
        }

        System.out.println("O maior número é: " + maior);


    }
}