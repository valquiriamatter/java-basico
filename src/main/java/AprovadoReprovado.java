import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 10.0) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        }else if(media >= 7.0) {
            System.out.println("APROVADO!");
        }else {
            System.out.println("REPROVADO!");
        }


    }


}
