package Interface;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EnglishLanguage english = new EnglishLanguage();
        ProgrammingLanguage pl = new ProgrammingLanguage();
        english.sayHi();
        pl.sayHi();
        english.sayBye();
        pl.sayBye();
        Animal animal = new Animal();
        animal.MakeNoise();

        Animal spiker = new Animal(){
            public void MakeNoise(){
                System.out.println("wouf wouf");
            }
        };
        spiker.MakeNoise();
    }
}
