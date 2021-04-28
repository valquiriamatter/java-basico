import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        double preco = 0;
        double valor = 0;
        double valorTotal = 0;
        String output = "";

        do{

            System.out.println("Digite o código do produto");
            int codigo = scan.nextInt();

            System.out.println("Digite a quantidade");
            int qtde = scan.nextInt();

            if(codigo == 100){
                preco = 1.20;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nCachorro Quente: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);
            }
            else if(codigo == 101){
                preco = 1.30;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nBauru Simples: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);
            }
            else if(codigo == 102){
                preco = 1.50;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nBauru com Ovo: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);

            }else if(codigo == 103){
                preco = 1.20;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nHambúrguer: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);

            }else if(codigo == 104){
                preco = 1.30;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nCheseburguer: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);

            }else if(codigo == 105){
                preco = 1.00;
                valor = qtde * preco;
                valorTotal += qtde * preco;
                output += "\nRefri: " + qtde + " ";
                System.out.println(output + "\nValor: " + valor);
            }

            System.out.println("Deseja encerrar o pedido? (s) ou (n)");
            String querSair = scan.next();

            if (querSair.equalsIgnoreCase("s")){
                sair = true;
             System.out.println("Valor à Pagar: " + valorTotal);

            }


        }while(!sair);






    }


}
