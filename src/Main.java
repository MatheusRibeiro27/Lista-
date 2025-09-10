import java.util.Scanner;

import static java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe dois numeros para realizar a soma: ");

        int valor = sc.nextInt();
        int valor2 = sc.nextInt();

        int resultado = valor + valor2;



        System.out.println("Essa é a soma: " + resultado );







        sc.close();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
