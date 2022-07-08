package Anonymous;

//We create class with method to show message
class A {
    public void show(){
        System.out.println("showing message from class A");
    }
}
//B extends A with the purpose of override class A method
class B extends A{
    public void show(){
        System.out.println("showing message from class B");
    }
}

public class AnonymousMain{
    public static void main(String[] args) {
        //Creating B object with the definition of A
        A obj = new B(){};
        // this will show B message
        obj.show();

        //Instead of overriding method of class A we can created an anonymous class
        //This is the Anonymous class that uses A method but with own param
        A obj2 = new A()
        {
            public void show(){
                System.out.println("Showing message from Anonymous Class");
            }
        };
        obj2.show();


    }
}
