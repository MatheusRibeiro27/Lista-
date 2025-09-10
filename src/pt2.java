import java.util.Scanner;

public class pt2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Infrome o valor do raio: ");

        double pi = 3.14159;

        double raio = sc.nextDouble();

        double resultado = pi * raio * raio;

        System.out.printf("Esse é o valor do raio: %.4f%n " , resultado);













        sc.close();







    }
}