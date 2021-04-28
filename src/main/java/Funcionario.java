import java.text.DecimalFormat;
import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite a tabuada que deseja (1-10)");
        //int tabuada = scan.nextInt();

        int anoContratado = 1995;
        double salario = 1000.00;
        //double percentualInicial = 1.5;
        int ano;
        //double novoSalario = 0;
        double percentual = 1.5;

        salario += (salario / 100) * percentual;

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");


        for (int i = 1997; i <= 2020; i++){

            percentual *=2;

            salario += ((salario / 100) * percentual);
            System.out.println("Salário atual do ano: " + i + " R$: " + decimalFormat.format(salario) + " - percentual %: " + percentual);

        }

        System.out.println("Salário inicial: " + salario);
        //System.out.println("Salário 1996: " + salario1996);
        //System.out.println("Salário atual: " + novoSalario);





    }





}
