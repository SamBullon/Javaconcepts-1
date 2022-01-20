/*/

 */
package GenericsMethods;
import Generics.Cat;
import Generics2.Dog;

public class GenericsMethodsMain {
    public static void main(String[] args) {

        //
        shout("John", 74);
        shout(57, 4);
        shout( new Cat(), new Dog());

    }
    // Generic permite crear methodos aqui de la clase Main
    // sin tener que crear una clase para ellos
    // en la parte <T, V> se agregan multiples tipos de clases
    private static <T, V> T shout (T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");


        return thingToShout;
    }

}
