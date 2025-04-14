import java.util.Scanner;

public class Questao4 {
    public static double fatorial(double numero){
        if(numero == 0) return 1;
        if(numero == 1) return 1;
        return numero*fatorial(numero-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();
        System.out.println("Fatorial:"+fatorial(numero));
    }
}