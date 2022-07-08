package Abstraction;

public class AnimalHerbivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("come planta");
    }

    @Override
    public void hacerSonido() {
        System.out.println("rawr...");
    }
}
