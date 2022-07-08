package ArrayList;
import javax.swing.JOptionPane;

public class Arrays3 {
    public static void main(String[] args) {
        //Use of lopp with array
        /*String [] arrayPaises = new String[8];
        arrayPaises[0] = "Espana";
        arrayPaises[1] = "Mexico";
        arrayPaises[2] = "Peru";
        arrayPaises[3] = "Chile";
        arrayPaises[4] = "Colombia";
        for (int i = 0; i< arrayPaises.length; i++){
            System.out.println("Pais = " + (i+1) + arrayPaises[i]);
        }*/
        //Array that fills up with users inputs
        /*String[] arrayPaises = new String[3];
        for (int i=0; i< arrayPaises.length;i++){
            arrayPaises[i]=JOptionPane.showInputDialog("Input country " + (i) );
        }
        for (String i : arrayPaises){
            System.out.println("Paises : " + i);
        }*/
        // Array that fills out with numbers automatically with Math.random
        int[] arraryOfRandoms = new int[10];
        for (int i=0; i< arraryOfRandoms.length;i++){
            arraryOfRandoms[i]= (int)Math.round(Math.random()*100);
        }
        for (int i : arraryOfRandoms){
            System.out.println(i);
        }

    }
}
