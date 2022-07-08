
/*/Para poder imprimir los tipos de dato Integer y Double hubieramos
necesitado una clase para cada tipo de dato osea Integer y Double
ahora con generics basta con crear una clase de tipo de dato <T>
y usarla desde main en donde podemos especificar que tipo de dato
 */

package Generics;

import Polymorphism.Dog;

import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {
        // asi usaríamos una clase para imprimir Integers sin usar Generics
        IntegerPrinter printer = new IntegerPrinter(25);
        printer.print();

        // Asi imprimimos un Integer con una clase generica
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(30);
        integerPrinter.print();
        // lo mismo para el tipo de dato double uso <double>
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(33.5);
        doublePrinter.print();
        //lo mismo para imprimir Strings
        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Hola");
        stringPrinter.print();

        //An array of Class Cat
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        System.out.println(cats);

         shout("Sam");
         shout(54);
         shout(new Cat());

    }
    public static <T> void shout(T thingToShout){
        System.out.println(thingToShout + "!!!");
    }
}
