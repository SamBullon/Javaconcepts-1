
/*/ Esta seria la clase para imprimir double sin usar generics
 Pero para evitar clases duplicadas usamos clase generica GenericPrinter
/*/


package Generics;

public class DoublePrinter {
    Double ThingToPrint;

    public void DoublePrinter(double ThingToPrint){
        this.ThingToPrint = ThingToPrint;
    }
    public void print(){
        System.out.println(ThingToPrint);
    }
}
