import java.util.Scanner;

public class Validacoes {

    public static void main(String[] args) {

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        boolean flag = false;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite o nome");
            nome = scan.nextLine();

            if(nome.length()>3){
                flag = true;
            }else{
                System.out.println("Nome precisa ser mais que 3 letras.");
            }

        }while(!flag);

        flag = false;

        do{
            System.out.println("Digite a idade");
            idade = scan.nextInt();

            if(idade > 0 && idade < 150){
                flag = true;
            }else{
                System.out.println("Idade deve ser maior que 0 e menor que 150.");
            }

        }while(!flag);

        flag = false;

        do{
            System.out.println("Digite o salário");
            salario = scan.nextDouble();

            if(salario > 0){
                flag = true;
            }else{
                System.out.println("Salário deve ser maior que 0.");
            }

        }while(!flag);

        flag = false;

        do{
            System.out.println("Digite o sexo: (f) ou (m)");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                flag = true;
            }else{
                System.out.println("Sexo Inválido! Digite (f) ou  (m).");
            }

        }while(!flag);

        flag = false;

        do{
            System.out.println("Digite o estado civil: (S) solteiro, (c) casado, (v) viúvo ou (d) divorciado");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")){
                flag = true;
            }else{
                System.out.println("Estado civil inválido!");
            }

        }while(!flag);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


    }


}
