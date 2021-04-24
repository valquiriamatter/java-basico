import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a Vítima? (S) ou (N)");
        String telefonou = scan.next();

        System.out.println("Esteve no local do crime? (S) ou (N)");
        String local = scan.next();

        System.out.println("Mora perto da vítima? (S) ou (N)");
        String mora = scan.next();

        System.out.println("Devia pra vítima? (S) ou (N)");
        String devia = scan.next();

        System.out.println("Já trabalhou com a vítima? (S) ou (N)");
        String trabalhou = scan.next();

        int i =0;

        if(telefonou.equalsIgnoreCase("S")) {
            i++;
        }if(local.equalsIgnoreCase("S")) {
            i++;
        }if(mora.equalsIgnoreCase("S")) {
            i++;
        }if(devia.equalsIgnoreCase("S")) {
            i++;
        }if(trabalhou.equalsIgnoreCase("S")) {
            i++;
        }

        if(i == 2){
            System.out.println("Você é supeito");
        }if(i >= 3 && i <= 4){
            System.out.println("Você é cúmplice!");
        }if(i >= 5 ){
            System.out.println("Você é o assasino!");
        }else if (i == 0){
            System.out.println("Você é inocente!");
        }


    }


}
