import java.util.Random;
import java.util.Scanner;

public class MatrizLeitura {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                System.out.println("Digite o número para a linha " + i + " e coluna " + j);
                numerosAleatorios[i][j] = scan.nextInt();
            }

        }

        int qtdePares = 0;
        int qtdeImpares = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                if (numerosAleatorios[i][j] % 2 == 0) {
                    qtdePares++;
                } else {
                    qtdeImpares++;
                }

            }
        }

        System.out.println("Quantidade de Números Pares = " + qtdePares);
        System.out.println("Quantidade de Números Ímpares = " + qtdeImpares);

        for(int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.println("Linha: " + i + " Coluna: " + j + " - " + numerosAleatorios [i][j]);

            }
        }


        }



    }

