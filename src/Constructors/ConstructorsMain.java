package Constructors;

public class ConstructorsMain {
    public static void main(String[] args) {
        Student student = new Student("Samuel","Bullon", 2020);
        student.printStudent();

        Dog dog = new Dog("Spiker", 8);
        System.out.println("Name of the dog "+dog.name+" is "+dog.age+" old");
        System.out.println();
    }
}
