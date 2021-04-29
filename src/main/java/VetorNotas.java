import java.util.Scanner;

public class VetorNotas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notasBimestre1 = new double[10];
        double[] notasBimestre2 = new double[10];

        double[] result = new double[notasBimestre1.length];

        for (int i = 0; i < notasBimestre1.length; i++) {

            System.out.println("Digite a nota do 1o Bimestre do aluno: " + (i+1));
            notasBimestre1[i] = scan.nextInt();

            System.out.println("Digite a nota do 2o Bimestre do aluno: " + (i+1));
            notasBimestre2[i] = scan.nextInt();
        }

        for (int i = 0; i < notasBimestre1.length; i++) {

            result[i] = (notasBimestre1[i] + notasBimestre2[i]) / 2;

            if (result[i] >= 7.0) {
                System.out.println("Aluno: " + i + " Aprovado! " + result[i]);
            } else {
                System.out.println("Aluno: " + i + " Reprovado! " + result[i]);
            }

        }


    }
}
