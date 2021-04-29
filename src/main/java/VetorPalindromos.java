import java.util.Scanner;

public class VetorPalindromos {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < vetorA.length/2; i++) {
            if (vetorA[i] != vetorA[vetorA.length -1 -i]){
                palindromo = false;
            }
        }

        System.out.print("Número do Vetor: ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        if (palindromo){
            System.out.println("Palindromo");
        }else {
            System.out.println("Não é Palindromo");
        }


    }
}
