import java.util.Random;

public class MatrizMaiorEMenor {

    public static void main(String[] args) {

        int [][] numerosAleatorios = new int[10][10];
        int maior5 = 0;
        int menor5 = 0;

        Random numerosRandomicos = new Random();

        for(int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numerosRandomicos.nextInt(100);
            }
        }

        int linha5 =5;

        for(int i=0; i<numerosAleatorios[linha5].length; i++){
            if(numerosAleatorios[linha5][i] > maior5){
                maior5 = numerosAleatorios [linha5][i];
            }
            if(numerosAleatorios[linha5][i] < menor5){
                menor5 = numerosAleatorios [linha5][i];
            }
        }

        System.out.println("Maior número da linha 5: " + maior5 + " e o menor número da linha 5: " + menor5 );

        for(int i=0; i<numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.println("Linha: " + i + " Coluna: " + j + " - " + numerosAleatorios[i][j]);

            }
        }

        int coluna7 = 7;
        int maior7 = 0;
        int menor7 = 101;

        for(int l =0; l< numerosAleatorios.length; l++){

            if(numerosAleatorios[l][coluna7] > maior7){
                maior7 = numerosAleatorios [l][coluna7];
            }
            if(numerosAleatorios[l][coluna7] < menor7){
                menor7 = numerosAleatorios [l][coluna7];
            }

        }
        System.out.println("Maior número da coluna 7: " + maior7 + " e o menor número da coluna 7: " + menor7 );

    }

}