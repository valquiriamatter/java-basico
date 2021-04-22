import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo numero");
        double numero2 = scan.nextDouble();

        System.out.println("Digite o terceiro numero");
        double numero3 = scan.nextDouble();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("Número " + numero1 + " é o maior");
        }else if(numero2 >numero1 && numero2 >numero3){
            System.out.println("Número " + numero2 + " é o maior");
        }else if(numero3 > numero1 && numero3 >numero2){
            System.out.println("Número " + numero3 + " é o maior");
        }



    }


}


