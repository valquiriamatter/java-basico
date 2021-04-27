import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada que deseja (1-10)");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for(int i=1; i<=10; i++){

            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);

        }


    }


}
