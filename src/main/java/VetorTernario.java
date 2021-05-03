import java.util.Scanner;

public class VetorTernario {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();

            //? é o if
            //: é o else
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;

            //para fazer imprimir o vetor ao contrário
            //vetorB[vetorA.length - i -1] = vetorA[i];
        }

        System.out.print("Vetor A: " );

        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B: " );

        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }




    }



}
