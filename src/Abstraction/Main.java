package Abstraction;

public class Main {
    public static void main(String[] args) {
        // solo podemos instanciar la clase mas joven y que
        //no es abstracta ya que no se pueden instanciar abstractas
        Planta planta = new Planta();
        planta.alimentarse();

        Animal animal = new AnimalCarnivoro();
        animal.alimentarse();
        animal.hacerSonido();

        AnimalHerbivoro animal2 = new AnimalHerbivoro();
    }

}
