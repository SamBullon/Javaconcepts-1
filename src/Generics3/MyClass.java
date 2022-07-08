package Generics3;
// This class can hold different type of variables
public class MyClass<T> {
    //creamos un objeto de tipo clase generics
    T myClassObject;

    //In this constructor the parameter will be a generic type class
    MyClass(T myClassObject){
        this.myClassObject = myClassObject;
    }
    //This function will show the class Type of variable myClassObject
    void showMyClassObjectType(){
        System.out.println(myClassObject.getClass().getName());
    }
}
