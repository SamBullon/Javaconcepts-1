package Abstraction;

public class AnimalCarnivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("Carnivoro come carne");
    }

    public void hacerSonido() {
        System.out.println("Roar!!");
    }
}
