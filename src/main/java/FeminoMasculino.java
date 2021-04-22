import java.util.Scanner;

public class FeminoMasculino {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o sexo: (F) ou (M)");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase ("f")) {
            System.out.println("É feminino!");
        }else if (sexo.equalsIgnoreCase("m")){
            System.out.println("É masculino");
        }else{
            System.out.println("Sexo inválido!");
        }
    }

}
