import java.util.Scanner;

public class pt4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);





        System.out.println("Informe o seu numero: " );

        int numero = sc.nextInt();

        System.out.println("Informe o valor que você recebe por hora: ");

        double horas = sc.nextDouble();

        System.out.println("Informe a sua hora de trabalho: ");

        double salary = sc.nextDouble();

        double r = salary * horas;

        System.out.println("Esse é o seu numero: " + numero  );

        System.out.printf("Esse é o seu salario: R$ %.2f%n " , r );





























        sc.close();
    }
}
