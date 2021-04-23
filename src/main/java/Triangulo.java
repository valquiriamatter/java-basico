import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo segundo");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado");
        double lado3 = scan.nextDouble();

        if(((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2 ) ||
                ((lado2 + lado3) > lado1)){

            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("É um triângulo equilátero!");
            }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("É um triângulo escaleno!");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles!");
            }
        }else{
            System.out.println("Não forma um triângulo!");
        }

        }


}
