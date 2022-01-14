package Division;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {

        try {
            //codigo
            int valor1, valor2, resultado;
            Scanner captura = new Scanner(System.in);

            System.out.println("Dame el primer valor");
            valor1 = captura.nextInt();

            System.out.println("Dame el segundo valor");
            valor2 = captura.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Resultado = " + resultado);

        } catch (Exception e) {
            //comportamiento
            System.out.println("Error " + e);

        }finally {
            System.out.println("Ejecucion completa!");
        }


    }
}
