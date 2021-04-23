import java.util.Scanner;

public class Turno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu turno: (M) MATUTINO, (V) VESPERTINO OU (N) NOTURNO");
        String turno = scan.next();

        if (turno.equalsIgnoreCase ("m")) {
            System.out.println("Bom Dia!");
        }else if (turno.equalsIgnoreCase("v")){
            System.out.println("Boa Tarde!");
        }else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa Noite!");
        } else{
            System.out.println("Turno inválido!");
        }
    }


}
