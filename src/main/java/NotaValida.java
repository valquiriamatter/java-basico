import java.util.Scanner;

public class NotaValida {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;

        do{
            System.out.println("Digite a nota: (1-10)");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            }else{
                System.out.println("Nota inválida " + nota + "\nDigite Novamente");
            }
        }while (!notaValida);




    }

}
