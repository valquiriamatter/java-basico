import java.util.Scanner;

public class ParesEImpares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i=0; i <10; i++) {

            System.out.println("Digite o número " + i );
            num = scan.nextInt();

            if(num % 2 == 0){
               pares ++;
            }else {
                impares++;
            }


        }

        System.out.println("Quantidade: " + pares + " Números Pares.");
        System.out.println("Quantidade: " + impares + " Números Ímpares.");

    }



}
