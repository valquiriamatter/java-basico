import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário atual");
        double salario = scan.nextDouble();
        double novoSalario;
        double valorAumento;

        if(salario <= 280.00) {

            novoSalario = salario + (salario / 100) * 20;
            valorAumento = novoSalario - salario;

            System.out.println("Seu salário atual é " + salario);
            System.out.println("O valor do seu aumento foi de 20%: " + valorAumento);
            System.out.println("Seu novo salário é " + novoSalario);

        }else if(salario >= 280.00 && salario <= 700.00 ) {

            novoSalario = salario + (salario / 100) * 15;
            valorAumento = novoSalario - salario;

            System.out.println("Seu salário atual é " + salario);
            System.out.println("O valor do seu aumento foi de 15%: " + valorAumento);
            System.out.println("Seu novo salário é " + novoSalario);

        }else if(salario >= 700.00 && salario < 1500.00 ) {

            novoSalario = salario + (salario / 100) * 10;
            valorAumento = novoSalario - salario;

            System.out.println("Seu salário atual é " + salario);
            System.out.println("O valor do seu aumento foi de 10%: " + valorAumento);
            System.out.println("Seu novo salário é " + novoSalario);

        }else if(salario >= 1500.00 ) {

            novoSalario = salario +(salario / 100) * 5;
            valorAumento = novoSalario - salario;

            System.out.println("Seu salário atual é " + salario);
            System.out.println("O valor do seu aumento foi de 5%: " + valorAumento);
            System.out.println("Seu novo salário é " + novoSalario);
        }
        else {
            System.out.println("Salário Inválido!");
        }


    }



}
