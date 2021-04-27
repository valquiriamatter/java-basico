import java.util.Scanner;

public class Populacao {

    public static void main(String[] args) {

        int popA;
        int popB;
        double taxaCrescimentoA;
        double taxaCrescimentoB;
        int cont = 0;
        boolean flag = false;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite a população A");
            popA = scan.nextInt();

            if(popA > 0){
                flag = true;
            }else{
                System.out.println("População A deve ser maior que 0.");
            }
        }while (!flag);

        flag = false;

        do{
            System.out.println("Digite a população B");
            popB = scan.nextInt();

            if(popB > 0){
                flag = true;
            }else{
                System.out.println("População B deve ser maior que 0.");
            }
        }while (!flag);

        flag = false;

        do{
            System.out.println("Digite a taxa de crescimento da população A");
            taxaCrescimentoA= scan.nextDouble();

            if(taxaCrescimentoA > 0){
                flag = true;
            }else{
                System.out.println("Taxa da população A deve ser maior que 0.");
            }
        }while (!flag);

        flag = false;

        do{
            System.out.println("Digite a taxa de crescimento da população B");
            taxaCrescimentoB= scan.nextDouble();

            if(taxaCrescimentoB > 0){
                flag = true;
            }else{
                System.out.println("Taxa da população B deve ser maior que 0.");
            }
        }while (!flag);

        cont = 0;

        while (popA < popB){
            popA += (popA /100) * taxaCrescimentoA;
            popB += (popB /100) * taxaCrescimentoB;

            cont ++;
        }




        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("A quantidade de anos é " + cont);


    }

}
