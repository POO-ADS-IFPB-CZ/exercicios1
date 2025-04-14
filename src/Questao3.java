import java.util.Scanner;

public class Questao3 {
    public static boolean ehPerfeito(int numero){
        int contador = 0;
        for(int i=1; i<numero;i++){
            if(numero%i==0) contador+=i;
        }
        return contador==numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();
        if(ehPerfeito(numero)) System.out.println("É perfeito");
        else System.out.println("Não é perfeito");
    }

}
