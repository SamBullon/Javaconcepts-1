package Generics2;
import Generics.Animal;

// T es por tipo de clase
// Esta vez heredamos las variables de Animal a la variable T de esta clase
// poniendolas dentro de <>
public class Generic2Printer<T extends Animal> {
    // Ahora La variable ThingToPrint tendra variables de Animal
    T thingToPrint;

    public Generic2Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        //Debido a que thingToPrint ahora tiene variables de Animal
        // Entonces podemos llamar un de los metodos de clase Animal eat()
        thingToPrint.eat();

        System.out.println(thingToPrint);
    }
}
