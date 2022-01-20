package GenericWildcard;

import Generics.Animal;
import Generics.Cat;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCardMain {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }
    private static void printList(List<?> myList){
        System.out.println();
    }

}
