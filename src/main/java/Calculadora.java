import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Qual operação deseja fazer? (+ - * /)");
        String operacao = scan.next();

        double resultado = 0;
        boolean verifica = true;

        switch (operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: System.out.println("Operação Inválida!"); verifica = false;
        }

        if (verifica){

            System.out.println("Resultado " + resultado);

            if (resultado >= 0){
                System.out.println("Resultado Positivo!");
            }else
                System.out.println("Resultado Negativo");
        }
        if (resultado % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }

    }






}
