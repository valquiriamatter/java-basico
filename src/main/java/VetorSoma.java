import java.util.Scanner;

public class VetorSoma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        for(int j=0; j < vetorA.length; j++){
            soma += vetorA[j];
        }

        System.out.println("A soma é: " + soma);


    }


}
