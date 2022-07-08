package Generics2;

public class WildCardClass<T extends Number> {
    T num;

    WildCardClass(T num){
        this.num = num;
    }

}
