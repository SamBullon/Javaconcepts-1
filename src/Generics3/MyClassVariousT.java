package Generics3;

public class MyClassVariousT<T, V> {
    T object1OfVariousT;
    V objectOfVariousT2;

    public MyClassVariousT(T MyClassVariousT, V objectOfVariousT2){
        this.object1OfVariousT = MyClassVariousT;
        this.objectOfVariousT2 = objectOfVariousT2;
    }
    void showMyVariousClassObjectType(){
        System.out.println(object1OfVariousT.getClass().getName()+ " "+
                objectOfVariousT2.getClass().getName());
    }
}
