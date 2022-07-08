package ArrayList;

import java.util.ArrayList;

public class ArrayMain {
    public static void main(String[] args) {
        //By putting Integer we are making this array strongly typed
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        //if we don't specify type of array it will take any type of objects
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(4);
        arrayList1.add(6);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add("carlos");
        System.out.println(arrayList1);

        arrayList1.add("Juan");
        System.out.println(arrayList1);

        String nombre = (String) arrayList1.get(4);
        System.out.println(nombre);

        arrayList1.set(4, "Luis");
        System.out.println(arrayList1);
        System.out.println("the array size is "+arrayList1.size());

        boolean chequeo = arrayList1.contains("Luis");
        System.out.println(chequeo);

        int [] miArray = new int[5];
        miArray[0]= 10;
        miArray[1]= 20;
        miArray[2]= 30;
        miArray[3]= 40;


        for (int i=0; i< miArray.length; i++){
            System.out.println(i +" = "+miArray[i]);
        }

    }

}
