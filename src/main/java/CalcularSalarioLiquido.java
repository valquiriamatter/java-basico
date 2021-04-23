import java.util.Scanner;

public class CalcularSalarioLiquido {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        double impostoRenda = (salario / 100) * 11;
        double inss = (salario / 100) * 8;
        double sindicato = (salario /100) * 5;

        double descontos = impostoRenda + inss + sindicato;
        double salarioLiquido = salario - descontos;

        System.out.println("O seu salário bruto é: " + salario);
        System.out.println("Valor INSS: " + inss);
        System.out.println("Valor Sindicato: " + sindicato);
        System.out.println("O seu salário líquido é: " + salarioLiquido);

    }

}