package Polymorphism;
//Veremos como un metodo llamado eat se comportara de 3 distintas
// formas  a pesar de ser el mismo metodo siempre

public class PolymorphismMain {
    public static void main(String[] args) {
        //Aqui el metodo eat se comporta como descrito en Clase Animal
        Animal animal = new Animal();
        animal.eat();

        //Aqui el mismo Metodo eat se comporta como descrito en Dog
        //volviendose asi polimorfica
        Dog myDog = new Dog();
        myDog.eat();
        myDog.eat(3);// aqui aplicamos method overloading
        System.out.println("");

        //Aqui el mismo Metodo eat se comporta como descrito en Cat
        //Adquiriendo un 3er comportamiento a pesar de estar dentro
        //de esta misma funcion main
        Cat myCat = new Cat();
        myCat.eat();



    }
}
