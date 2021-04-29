import java.util.Scanner;

public class VetorSomaImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] vetorA = new int [10];
        int soma = 0;
        int qtdeImpares = 0;

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++){
           if (vetorA[i] % 2 !=0){
               soma += vetorA[i];
               qtdeImpares ++;
           }
        }

        System.out.print("Vetor A: " );

        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }


        System.out.println("\n A soma é: " + soma);
        System.out.println("A média é: " + (soma/qtdeImpares));



    }



}
