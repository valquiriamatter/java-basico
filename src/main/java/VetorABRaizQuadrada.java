import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorABRaizQuadrada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Valores do Vetor A = ");

        for(int i = 0; i < vetorA.length; i++){

            System.out.print(vetorA[i] + " ");
        }

        System.out.println("");
        System.out.print("Valores do Vetor B = ");

        DecimalFormat dc = new DecimalFormat("###,###.###");

        for(int i = 0; i < vetorA.length; i++){
            System.out.print(dc.format(vetorB[i]) + " ");
        }
    }



}
