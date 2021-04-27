import java.util.Scanner;

public class NomeESenha {

    public static void main(String[] args) {

        boolean notaValida = false;
        String nome;
        String senha;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite o seu nome");
            nome = scan.nextLine();

            System.out.println("Digite sua senha");
            senha = scan.nextLine();

            if (senha.equalsIgnoreCase(nome)){
                System.out.println("Senha não pode ser igual ao nome. " + nome + " " + senha);
            }else{
                notaValida = true;
                System.out.println("Senha Atualizada " + nome + " " + senha);
            }
        }while (!notaValida);




    }

}
