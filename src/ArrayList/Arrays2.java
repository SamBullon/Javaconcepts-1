package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrays2 {
    public static void main(String[] args) {
        String [] myArray = new String[6];
        myArray[0]="Venezuela";
        myArray[1]="Peru";
        myArray[2]="Mexico";
        myArray[3]="Colombia";
        myArray[4]="Ecuador";
        myArray[5]="Argentina";

        for(int i=0; i<6; i++){
            System.out.println("Pais " +myArray[i]);
        }
        for(int i= 5; i>-1;i--){
            System.out.println("Paises al reves "+myArray[i]);
        }
        /*
        for(String elemento:myArray){
            System.out.println("Pais " + elemento);
        }*/
    }
}
