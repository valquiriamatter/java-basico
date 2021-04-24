import java.util.Scanner;

public class Posto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de litros?");
        int litros = scan.nextInt();

        System.out.println("Qual o combustível desejado? (G) gasolina ou (A) alcool)");
        String combustivel = scan.next();

        double precoG = 2.5;
        double precoA = 1.9;

        double valorTotal = 0;
        double totalDesconto = 0;
        int percentualDesc = 0;

        if (combustivel.equalsIgnoreCase("g")){
            if (litros <= 20){
                percentualDesc = 4;
            }
            valorTotal = litros * precoG;

        }else{
                percentualDesc = 6;
        }

        if (combustivel.equalsIgnoreCase("a")){
            if (litros <= 20){
                percentualDesc = 4;
            }
            valorTotal = litros * precoA;
        }else{
            percentualDesc = 6;
        }

        totalDesconto = (valorTotal / 100) * percentualDesc;
        double valorPagar = valorTotal - totalDesconto;

        System.out.println("Valor à ser Pago " + valorPagar);


    }




}
