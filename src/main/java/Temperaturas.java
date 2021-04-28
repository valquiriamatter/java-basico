import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de temperaturas que deseja informar.");
        int numTemperturas = scan.nextInt();

        double maiorTemperatura = Double.MIN_VALUE;
        double menorTemperatura = Double.MAX_VALUE;
        double somaTemperaturas = 0;

        for(int i=1; i<=numTemperturas; i++){

            System.out.println("Digite a temperatura " + i);
            double tempertura = scan.nextDouble();

            if(tempertura > maiorTemperatura){
                maiorTemperatura = tempertura;
            }
            if(tempertura < menorTemperatura){
                menorTemperatura = tempertura;
            }

            //System.out.println("Você digitou " + tempertura);

            somaTemperaturas += tempertura;

        }

        System.out.println("Maior Temperatura até o momento " + maiorTemperatura);
        System.out.println("Menor Temperatura até o momento " + menorTemperatura);
        System.out.println("\nA média das temperaturas é: " + (somaTemperaturas / numTemperturas));


    }



}
