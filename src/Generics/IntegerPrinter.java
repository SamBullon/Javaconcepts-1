/*/ Esta seria la clase para imprimir Intergers sin usar generics
 Pero para evitar clases duplicadas usamos clase generica GenericPrinter
/*/

package Generics;

public class IntegerPrinter {
    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
