import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = scan.nextInt();

        System.out.println( "Fatorial de " + n + "!");
        System.out.print( n + "! = ");

        int fatorial = 1;

        for (int i=n; i>1; i--){
            fatorial *= i;
            System.out.print (i + " . ");
        }

        System.out.println(" 1 =  " + fatorial);


    }

}
