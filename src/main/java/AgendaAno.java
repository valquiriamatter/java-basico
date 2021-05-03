import java.util.Scanner;

public class AgendaAno {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String[][][] compromissos  = new String [12][31][8];

    boolean sair = false;
    int mes = 0;
    boolean mesValido = false;
    int dia = 0;
    boolean diaValido = false;
    int hora = 0;
    boolean horaValida = false;

        while(!sair) {

            System.out.println("Digite a opção desejada:\n1 Adicionar Compromisso\n" +
                    "2 Consultar Compromisso\n0 Sair");
            int opcao = scan.nextInt();

            if (opcao == 1) { //add compromisso

                System.out.println("Digite o Mês que Deseja Adicionar Compromisso");
                mes = scan.nextInt();

                mesValido = false;

                while (!mesValido) {
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês Inválido!");
                        mesValido = false;
                    }
                }

                System.out.println("Digite o Dia do Mês que Deseja Adicionar Compromisso");
                dia = scan.nextInt();

                diaValido = false;

                while (!diaValido) {
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia do Mês Inválido!");
                        diaValido = false;
                    }
                }
                System.out.println("Digite o Horário do Compromisso");
                hora = scan.nextInt();

                horaValida = false;

                while (!horaValida) {
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora Inválida!");
                        horaValida = false;
                    }
                }

                System.out.println("Digite o Compromisso");
                compromissos[--mes][--dia][hora] = scan.next();


            } else if (opcao == 2) { //verificar compromisso

                System.out.println("Digite o Mês que Deseja Consultar Compromisso");
                mes = scan.nextInt();

                mesValido = false;

                while (!mesValido) {
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês Inválido!");
                        mesValido = false;
                    }
                }

                System.out.println("Digite o Dia do Mês que Deseja Consultar Compromisso");
                dia = scan.nextInt();

                diaValido = false;

                while (!diaValido) {
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia do Mês Inválido!");
                        diaValido = false;
                    }
                }
                System.out.println("Digite o Horário do Compromisso");
                hora = scan.nextInt();

                horaValida = false;

                while (!horaValida) {
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora Inválida!");
                        horaValida = false;
                    }
                }
                mes--;
                dia--;

                System.out.println("O compromisso agendado é: " + compromissos[mes][dia][hora]);

            } else if (opcao == 0) { // sair
                sair = true;
            } else {
                System.out.println("Opção Inválida. Digite Novamente...");
            }


        }

    }


}









