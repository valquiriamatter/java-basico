import java.util.Scanner;

public class VetorMaiorMenorIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades  = new int[10];

        for(int i=0; i < idades.length; i++){
            System.out.println("Digite uma idade para a posição: " + i);
            idades[i]= scan.nextInt();
        }

        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for(int i=0; i < idades.length; i++) {

            if(idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;

            } else if (idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }

        }

        System.out.println();

        System.out.println("Menor Idade " + menor + " Index " + indexMenor);
        System.out.println("Maior Idade " + maior + " Index " + indexMaior);




    }



}
