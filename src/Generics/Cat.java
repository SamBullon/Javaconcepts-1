package Generics;

public class Cat extends Animal {
    String name;

    public Cat(String name){
        this.name = name;
    }
    public Cat(){
    }

    public Cat eat(){
        System.out.println("cats eats meow meow");
        return eat();
    }
}
