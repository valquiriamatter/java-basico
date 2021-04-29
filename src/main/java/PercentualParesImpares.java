import java.util.Scanner;

public class PercentualParesImpares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdePares = 0;
        int qtdeImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                qtdePares++;

            }
        }

        qtdeImpares = vetorA.length - qtdePares;

        // vetorA[].length = 100
        // pares = x
        // porcentagem = x * vetorA.length == qtdePares * 100;
        // x == vetorA.length / 100

        System.out.print("Números do Vetor: ");

        for (int i=0; i<vetorA.length; i++){
            System.out.print( vetorA[i] + " ");
        }

        System.out.println("\nQuantidade de Números Pares do Vetor: " + qtdePares);

        double porcentagemPares = (qtdePares * 100) / vetorA.length;
        double porcentagemImpares = 100 - porcentagemPares;

        System.out.println("Porcentagem Pares " + porcentagemPares);
        System.out.println("Porcentagem Impares " + porcentagemImpares);



    }
}
