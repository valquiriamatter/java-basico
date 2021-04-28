import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdeProdutos;
        double preco;
        double total;
        String output = "" ;
        double valorPago;
        double troco;


        do{
            System.out.println("Deseja informar uma nova compra? (s) ou (n)");
            continuarCompra = scan.next();

            if(continuarCompra.equalsIgnoreCase("s")){

                System.out.println("Lojas Tabajara \n");

                System.out.println("Digite a quantidade de itens da compra:");
                qtdeProdutos = scan.nextInt();

                total = 0;

                for(int i=1; i<=qtdeProdutos; i++){
                    System.out.println("Informe o preço do produto " +i);
                    preco = scan.nextDouble();

                    output += "Produto" + ": R$ " + preco + "\n";
                    total += preco;


                }

                output += "Total: R$ " + total;
                System.out.println("Total: " + total + "\n");

                System.out.println("Entre com o valor pago");
                valorPago = scan.nextDouble();

                output += "\nDinheiro: " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;
                System.out.println(output);

            }else {
                sair = true;
            }


        }while (!sair);

        int notas = scan.nextInt();

    }
}
