import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de notas");
        int notas = scan.nextInt();

        double soma = 0;
        double media = 0;
        double nota;

        for (int i=0; i<notas; i++){
            System.out.println("Entre com a nota " + (i+1));
            nota = scan.nextDouble();

            soma += nota;
        }

        System.out.println("A soma é " + soma);
        System.out.println("A média é " + soma/notas);

    }


}
