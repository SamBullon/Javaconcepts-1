// En esta main vemos herencia de clases hijas que a su
//vez heredaron de una clase padre. ambas clases estando en otro
//paquete llamado Herencia2

package Herencia1;
import Herencia2.subclass_add;
import Herencia2.subclass_substract;

public class main {
    public static void main(String[] args) {
        //para hacer uso de metodos sumar/restar es necesario primero
        // crear un objeto de cada clase hija que suma y que resta
        subclass_add suma = new subclass_add();
        subclass_substract resta = new subclass_substract();
        //heredamos metodos de pedir datos y sumar
        //para no escribirlos nuevamente
        suma.PedirDatos();
        suma.Sumar();
        System.out.println("El resultado de la suma es: " );
        suma.MostrarResultado();

        //heredamos metodos de pedir datos y restar
        //para no escribirlos nuevamente
        resta.PedirDatos();
        resta.Restar();
        System.out.println("El resultado de resta es: ");
        resta.MostrarResultado();

    }
}
