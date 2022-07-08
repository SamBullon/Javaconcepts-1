package Stacks;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        //Stack will give us the last element indexed as is based on FILO (first in last out)
        Stack pila = new Stack<>();
        pila.push(5); // indice 0
        pila.push("First Word"); // indice 1
        pila.push(50);
        pila.push("Last Word");


        //Peek method can only get us last element of Stal
        System.out.println("Last elemento of Stack is: "+pila.peek());

        System.out.println(pila);
        //We use loop to get every last element en delete it until Stack is empty
        while (pila.empty()==false){
            System.out.println(pila.pop());//pop gets and deletes last element of stack
        }
        //This will show the Stack status after the element deletion
        System.out.println(pila);
    }
}
