import java.util.Scanner;

public class VetorPares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA  = new int[10];
        int[] vetorPares = new int[vetorA.length];
        int qtdePares = 0;

        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i]= scan.nextInt();

            if (vetorA[i] % 2 == 0){
               vetorPares[i] = vetorA[i];
               qtdePares ++;

            }

        }
        System.out.println("Quantidade de Números Pares do Vetor: " + qtdePares);
        System.out.print("Número Pares do Vetor: ");
        for (int i=0; i< vetorPares.length; i++){
            System.out.print( vetorPares[i] + " ");
        }


    }


}
