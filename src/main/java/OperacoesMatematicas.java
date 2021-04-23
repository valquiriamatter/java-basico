import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int numero2 = scan.nextInt();

        System.out.println("Digite um número real");
        double numero3 = scan.nextDouble();

        double resultado1 = (numero1 * 2) * (numero2 / 2) ;
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);


        System.out.println("O resultado 1 é: (o produto do dobro do primeiro com metade do segundo) " + resultado1);
        System.out.println("O resultado 2 é: (a soma do triplo do primeiro como terceiro) " + resultado2);
        System.out.println("O resultado 3 é: (o terceiro elevado ao cubo.) " + resultado3);

    }

}
