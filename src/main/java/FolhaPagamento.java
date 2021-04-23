import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double percentualIR = 0;

        if(salarioBruto >= 900 && salarioBruto <= 1500){
            percentualIR = 0;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 5;
        }else if(salarioBruto <= 2500){
            percentualIR = 10;
        }else if(salarioBruto > 2500){
            percentualIR = 20;
        }

        double valorIR = (salarioBruto / 100) * percentualIR;

        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double sindicato = (salarioBruto /100) * 3;

        double descontos = valorIR + inss;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("O seu salário bruto é: " + salarioBruto);
        System.out.println("Valor IR: " + valorIR);
        System.out.println("Valor INSS: " + inss);
        System.out.println("Valor FGTS: " + fgts);
        System.out.println("Total dos Descontos: : " + descontos);
        System.out.println("O seu salário líquido é: " + salarioLiquido);

    }



}
