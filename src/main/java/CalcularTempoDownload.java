import java.util.Scanner;

public class CalcularTempoDownload {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo que deseja baixar");
        double tamanho = scan.nextDouble();

        System.out.println("Digite a sua velocidade de internet");
        double velocidade = scan.nextDouble();

        double tempo = tamanho / velocidade;


        System.out.println("O tempo aproximado de download é: " + tempo);






    }

}