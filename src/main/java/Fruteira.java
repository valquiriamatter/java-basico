import java.util.Scanner;

public class Fruteira {

    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a quantidade de kgs");
    double qtdeMorango = scan.nextDouble();

    System.out.println("Digite a quantidade de kgs");
    double qtdeMaca = scan.nextDouble();

    double precoKgMorango = 0;

    if(qtdeMorango <= 5){
        precoKgMorango = 2.50;
    }else {
        precoKgMorango = 2.20;
    }

    double precoKgMaca = 0;

    if(qtdeMaca <= 5){
        precoKgMaca = 1.80;
    }else {
        precoKgMaca = 1.50;
    }

    double precoTotalMorango = qtdeMorango * precoKgMorango;
    double precoTotalMaca = qtdeMaca * precoKgMaca;

    double precoParcial = precoTotalMaca + precoTotalMorango;
    double precoTotal = 0;

    if((qtdeMorango + qtdeMaca > 8) || precoParcial > 25){
        precoTotal = precoParcial - (precoParcial / 100) * 10;
    }

        System.out.println("O preço total é: " + precoTotal);
    }




}
