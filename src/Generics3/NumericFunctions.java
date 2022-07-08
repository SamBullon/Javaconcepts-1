package Generics3;
/*This is a class of functions that can operate on numbers thus has to
* bound the types for numeric types as Strings cannot be operated numerically
* The <T extends Numbers> means we'll have T to only take numeric values
* and Number is a Class that only takes: Integer, Double, Float*/
public class NumericFunctions<T extends Number> {
    T objectOfNumeric;

    NumericFunctions(T objectOfNumeric){
        this.objectOfNumeric = objectOfNumeric;
    }
    //We create a function to get the square of a number
    double square(){
        //we set the object to numeric values to specify to take numeric types
        return objectOfNumeric.intValue() * objectOfNumeric.doubleValue();
    }

}
