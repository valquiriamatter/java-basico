import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorABC {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    double[] vetorC = new double[vetorA.length];

    for(int i = 0; i < vetorA.length; i++){
        System.out.println("Entre com o valor da posição: " + i + " do vetor A");
        vetorA[i] = scan.nextInt();
    }

    for(int i = 0; i < vetorB.length; i++){
        System.out.println("Entre com o valor da posição: " + i + " do vetor B");
        vetorB[i] = scan.nextInt();
    }

    for(int i = 0; i < vetorC.length; i++){
        vetorC[i] = vetorA[i] * + vetorB[i];
    }

    System.out.print("Valores do Vetor A = ");

    for(int i = 0; i < vetorA.length; i++){
        System.out.print(vetorA[i] + " ");
    }

    System.out.println("");
    System.out.print("Valores do Vetor B = ");

    for(int i = 0; i < vetorB.length; i++){
        System.out.print(vetorB[i] + " ");
    }

    System.out.println("");
    System.out.print("Valores do Vetor C = ");

    for(int i = 0; i < vetorC.length; i++){
        System.out.print(vetorC[i] + " ");
    }



}



}
