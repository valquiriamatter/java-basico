import java.util.Scanner;

public class TabuadaPersonalizada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada que deseja (1-10)");
        int tabuada = scan.nextInt();

        boolean invalido = true;
        int numeroInicial;
        int numeroFinal;

        do{
            System.out.println("Digite o número em que deseja iniciar");
            numeroInicial = scan.nextInt();

            System.out.println("Digite o número em que deseja finalizar");
            numeroFinal = scan.nextInt();

            if(numeroFinal > numeroInicial){
                invalido = false;
            }else{
                System.out.println("O número final deve ser maior que o número inicial.\n");
            }
        }while (invalido);

        System.out.println("\nComeçar por: " + numeroInicial);
        System.out.println("Terminar em: " + numeroFinal);

        System.out.println("\nVou anotar a tabuada de: " + tabuada + " começando em "
                        + numeroInicial + " e terminando em: " + numeroFinal + ";");

        for(int i=numeroInicial; i<=numeroFinal; i++){
            //for (int j=0; j>=numeroFinal; j++);

            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);

        }


    }



}
