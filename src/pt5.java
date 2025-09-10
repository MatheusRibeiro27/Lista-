import java.util.Scanner;

public class pt5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, codigo1, numero2, codigo2 ;

        double valor1, valor2, peca ;

        System.out.println("informe o numero de 1 peça:  ");

        numero1 = sc.nextInt();

        System.out.println("Informe o codigo da 1 peça: ");

        codigo1 = sc.nextInt();

        System.out.println("Infrome o valor da 1 peça: ");

        valor1 = sc.nextDouble();

        System.out.println("informe um numero da 2 peça:  ");

        numero2 = sc.nextInt();

        System.out.println("Informe o codigo da 2 peça: ");

        codigo2 = sc.nextInt();

        System.out.println("Infrome o valor da 2 peça: ");

        valor2 = sc.nextDouble();




        peca = valor1 * codigo1 + valor2 * codigo2;


        System.out.printf("Esse é o valor a pagar: R$ %.2f%n " , peca );




























        sc.close();


    }
}
