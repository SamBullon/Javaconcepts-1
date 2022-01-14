package Polymorphism;

public class Dog extends Animal{
    private int breed;

    //Sobre el metodo eat heredado de Animal escribimos
    //Un nuevo metodo eat exclusivo para Dog
    public void eat(){
        System.out.println("chum chum");
    }
   //aqui un ejemplo de method overloading ya que es mismo metodo eat
    // duplicod dentro de la clase Dog pero con diferentes parametros
    public void eat(int numberOfTimes){
        for (int i = 0; i < numberOfTimes; i++){
            System.out.print("chum chum");
        }

    }

    public int getBreed(){
        return breed;
    }
    public void setBreed(int breed){
        this.breed = breed;

    }
}
