import java.util.Scanner;

public class SeriePersonalizada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de N");
        int n = scan.nextInt();
        int baixo = 0;
        double soma = 0;

        for (int i = 1,j = 1; i<=n; i++, j+=2){

            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }

        System.out.println("\nSoma " + soma);





    }


}
