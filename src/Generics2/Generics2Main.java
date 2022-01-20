/*/Para poder imprimir los tipos de dato Integer y Double hubieramos
necesitado una clase para cada tipo de dato osea Integer y Double
ahora con generics basta con crear una clase de tipo de dato <T>
y usarla desde main en donde podemos especificar que tipo de dato
 */

package Generics2;
import Generics.Cat;

import java.util.ArrayList;

public class Generics2Main {
    public static void main(String[] args) {

        //
        //Aqui Inicializamos un Objeto de la clase que imprime cosas Generic2Printer
        Generic2Printer<Cat> Generic2Printer = new Generic2Printer<>(new Cat());
        //Sobre este objeto Generic2Printer mostramos como el gato come
        //Generic2Printer muestra como comen todos los Aniaml
        //Y Cat puede comer porque heredo el metodo eat de su clase Padre Animal
        // por eso Generic2Printer mostrara como new Cat() come
        Generic2Printer.print();

        Generic2Printer<Dog> Generic2Printer2 = new Generic2Printer<>(new Dog());
        Generic2Printer2.print();


        //Type safety issue resolved by Generics on arraylist
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        //cats.add(new Dog());

        Cat myCat = cats.get(0);

    }



}
