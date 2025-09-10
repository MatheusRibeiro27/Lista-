import java.util.Scanner;

public class pt6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c , trapezio, triangulo, circulo, quadrado, retangulo;


        System.out.println("Informe o valor da a: ");

        a = sc.nextDouble();

        System.out.println("Informe o valor de b: ");

        b = sc.nextDouble();

        System.out.println("Informe o valor de c: ");

        c = sc.nextDouble();

        triangulo = a * c /2;

        circulo =  3.14159 * c * c;

        trapezio = (a + b) / 2.0 * c;

        quadrado = b * b;

        retangulo =  a * b;


        System.out.printf("Esse é o seu Triangulo: %.3f%n " , triangulo  );

        System.out.printf("Esse é o circulo: %.3f%n " , circulo  );

        System.out.printf("Esse é o Trapezio: %.3f%n " , trapezio  );

        System.out.printf("Esse é o Quadrado: %.3f%n " , quadrado  );

        System.out.printf("Esse é o Retangulo: %.3f%n " , retangulo  );
































        sc.close();
    }



}
