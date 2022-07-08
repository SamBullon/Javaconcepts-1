package Generics3;

public class Gen3Main {
    public static void main(String[] args) {
        //Showing logic for MyClass printing
        MyClass<Integer> object1 = new MyClass<>(10);
        MyClass<Double> object2 = new MyClass<>(20.0);
        object1.showMyClassObjectType();
        object2.showMyClassObjectType();

        //Showing logic for MyClassVariosT printing
        //<> will expect 2 types now
        MyClassVariousT<Integer, Double> object3 = new MyClassVariousT<>
                (50, 80.0);
        object3.showMyVariousClassObjectType();

        //Creating object of Class Numeric functions
        NumericFunctions<Integer> objectFromNumeric = new  NumericFunctions<>(4);
        System.out.println(objectFromNumeric.square());



    }



}
