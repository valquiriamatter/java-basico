import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }





    }

}
