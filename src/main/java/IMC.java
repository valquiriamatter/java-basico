import java.util.Scanner;

    public class IMC {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o seu nome");
            String nome = scan.next();

            System.out.println("Digite a sua altura: (Exemplo: 1,70)");
            double altura = scan.nextDouble();

            System.out.println("Digite o seu peso");
            double peso = scan.nextDouble();

            double imc = peso / (altura * altura);

            if(imc < 18.5){
                System.out.println("O seu imc é: " + imc);
                System.out.println(nome + " você está abaixo com o IMC abaixo do ideal");
            }else if (imc >= 18.5 && imc < 24.9){
                System.out.println("O seu imc é: " + imc);
                System.out.println(nome + " você está com o IMC ideal");
            }else if (imc > 25 && imc < 29.9) {
                System.out.println("O seu imc é: " + imc);
                System.out.println(nome + " você está com sobrepeso");
            }



        }

    }





