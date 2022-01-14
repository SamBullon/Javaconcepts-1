package Herencia2;
import java.util.Scanner;

public class Superclass {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    ///Metodo que pide valores
    public void PedirDatos(){
        System.out.println("ingresa primer valor");
        valor1 = entrada.nextInt();

        System.out.println("ingresa 2do valor");
        valor2 = entrada.nextInt();

    }
    // Metodo para resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }

}
