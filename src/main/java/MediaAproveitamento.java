import java.util.Scanner;

public class MediaAproveitamento {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("As notas informadas foram: " + nota1 + " " + nota2);

        if(media >= 9){
            System.out.println("Sua média foi: " + media + " Conceito A: APROVADO!");
        } else if(media > 7.5 && media < 9){
            System.out.println("Sua média foi: " + media + " Conceito B: APROVADO!");
        }else if(media > 6 && media < 7.5){
            System.out.println("Sua média foi: " + media + " Conceito C: APROVADO!");
        }else if(media > 4 && media < 6){
            System.out.println("Sua média foi: " + media + " Conceito D: REPROVADO!");
        }else if(media > 0 && media < 4){
            System.out.println("Sua média foi: " + media + " Conceito E: REPROVADO!");
        }



    }


}
