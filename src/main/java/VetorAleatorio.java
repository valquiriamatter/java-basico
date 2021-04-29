import java.util.Scanner;

public class VetorAleatorio {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtde0 = 0;
        int qtde1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                qtde0++;
            } else if (vetorA[i] == 1) {
                qtde1++;
            }
        }


        double porcentagem0 = (qtde0 * 100) / vetorA.length;
        double porcentagem1 = (qtde1 * 100) / vetorA.length;

        System.out.print("Número do Vetor: ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nA porcentagem de 0 é: " + porcentagem0);
        System.out.println("A porcentagem de 1 é: " + porcentagem1);

    }

}
