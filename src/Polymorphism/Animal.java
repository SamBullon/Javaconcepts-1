package Polymorphism;

public class Animal {
    private String name, color;

    public void eat(){
        System.out.println("Animal eats munch munch");
    }

    public String getName(){
        return name;
    }
    public void setColor(String name){
        this.name = name;
    }

}
