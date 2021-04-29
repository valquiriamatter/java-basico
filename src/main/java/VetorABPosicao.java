import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorABPosicao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
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


