
/*/Para poder imprimir los tipos de dato Integer y Double hubieramos
necesitado una clase para cada tipo de dato osea Integer y Double
ahora con generics basta con crear una clase de tipo de dato <T>
y usarla desde main en donde podemos especificar que tipo de dato
 */

package Generics;

import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {
        // asi usaríamos una clase para imprimir Integers sin usar Generics
        IntegerPrinter printer = new IntegerPrinter(25);
        printer.print();

        // Aqui especifico que tipo de dato quiero a traves de <Integer>
        GenericPrinter<Integer> genericprinter = new GenericPrinter<>(30);
        genericprinter.print();
        // lo mismo para el tipo de dato double uso <double>
        GenericPrinter<Double> genericprinter2 = new GenericPrinter<>(33.5);
        genericprinter2.print();

        ArrayList<Object> cats = new ArrayList<>();

    }
}
