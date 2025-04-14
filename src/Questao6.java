import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "123456";
        boolean logado = false;
        for(int i=0;i<3;i++){
            System.out.println("Digite a senha: ");
            String entrada = scanner.nextLine();
            if(entrada.equals(senha)){
                logado = true;
                break;
            }
        }
        if(logado){
            System.out.println("Bem vindo");
        }
    }

}