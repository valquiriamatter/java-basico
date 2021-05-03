import java.util.Random;

public class Matriz {

    public static void main(String[] args) {

        int [][] numerosAleatorios = new int[4][4];

        Random numerosRandom = new Random();

        for(int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numerosRandom.nextInt(100);
            }

        }

        int maior = 0;
        int colunaMaior = 0;
        int linhaMaior = 0;

        for(int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){

                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }

        }

        System.out.println("Maior valor: " + maior + " está na linha " + linhaMaior + " coluna " + colunaMaior);

        for(int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.println("Linha: " + i + " Coluna: " + j + " - " + numerosAleatorios [i][j]);

            }

        }



        }



}
