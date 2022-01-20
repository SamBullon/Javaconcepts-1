/*/ Esta seria la clase para imprimir strings sin usar generics
 Pero para evitar clases duplicadas usamos clase generica GenericPrinter
/*/
package Generics;

public class StringPrinter {
    String ThingToPrint;

    public void ThingToPrint(String ThingToPrint){
        this.ThingToPrint = ThingToPrint;
    }
    public void print(){
        System.out.println(ThingToPrint);
    }
}
