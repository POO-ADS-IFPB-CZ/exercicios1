import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de a:");
        double a = scanner.nextDouble();
        System.out.println("Informe o valor de b:");
        double b = scanner.nextDouble();
        System.out.println("Informe o valor de c:");
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2) -4*a*c;

        if(delta<0) System.out.println("Não possui raízes");
        if(delta==0) System.out.println("Duas raízes iguais: "+(-b/(2*a)));
        if(delta>0){
            System.out.println("X1= "+((-b+Math.sqrt(delta))/(2*a)));
            System.out.println("X2= "+((-b-Math.sqrt(delta))/(2*a)));
        }



    }
}