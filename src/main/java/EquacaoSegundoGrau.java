import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é equação do 2o grau.");
        } else {
            System.out.println("Digite o valor de b");
            double b = scan.nextInt();

            System.out.println("Digite o valor de c");
            double c = scan.nextInt();

            double delta = (Math.pow(b,2)) - (4* a * c);

            System.out.println("Delta é: " + delta);

            if(delta < 0){
                System.out.println("DELTA NEGATIVO: A equação não possui números reais.");
            }else{
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 é: " + x1);
                System.out.println("x2 é: " + x2);

            }
        }




    }
}