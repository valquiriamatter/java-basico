import java.util.Scanner;

public class Hipermercado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo da carne: (1) file duplo (2) alcatra (3) picanha");
        int tipoCarne = scan.nextInt();

        System.out.println("Digite a quantidade em kg");
        double quantidade = scan.nextDouble();
        double precoKg = 0;

        if (tipoCarne == 1){

            System.out.println(quantidade + " tipo 1 - filé-duplo");
            if (quantidade < 5){
                precoKg = 4.9;
            }else{
                precoKg = 5.8;
            }
        }else if (tipoCarne == 2){

            System.out.println(quantidade + " tipo 2 - alcatra");

            if (quantidade < 5){
                precoKg = 5.9;
            }else{
                precoKg = 6.8;
            }
        } else if (tipoCarne == 1){

            System.out.println(quantidade + " tipo 3 - picanha");

            if (quantidade < 5){
                precoKg = 6.9;
            }else{
                precoKg = 7.8;
            }
        }

        double precoTotal = quantidade * precoKg;

        System.out.println(quantidade + " é a quantidade");
        System.out.println(precoKg + " preço por kg");
        System.out.println("O preço total é: " + precoTotal);

        System.out.println("Compra no Cartão: (1) sim (2) não");
        int cartao = scan.nextInt();

        if(cartao == 1){
            Double desconto = (precoTotal /100) * 5;
            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a pagar: " + (precoTotal - desconto));
        }else{
            System.out.println("Valor a pagar: " +  precoTotal);
        }


    }


}
