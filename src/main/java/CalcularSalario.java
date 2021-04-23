import java.util.Scanner;

public class CalcularSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O seu salário é: " + salario);

    }

}