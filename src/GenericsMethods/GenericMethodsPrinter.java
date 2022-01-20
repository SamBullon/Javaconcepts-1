package GenericsMethods;
import Generics.Animal;
import java.io.Serializable;

public class GenericMethodsPrinter<T extends Animal & Serializable>  {
    T thingToPrint;
    //V otherThing;

    public GenericMethodsPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }

}


