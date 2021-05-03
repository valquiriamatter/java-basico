import java.util.Scanner;

public class VetorTabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nTabuada de: " + vetorA[i]);

            for(int j=1; j<=10; j++){
                System.out.println( j + " x " + vetorA[i] + " = " + (vetorA[i]*j));
            }

            System.out.println("");

        }

    }


}
