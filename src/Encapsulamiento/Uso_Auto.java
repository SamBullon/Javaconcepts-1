package Encapsulamiento;

public class Uso_Auto {
    public static void main(String[] args) {
        //instanciacion de clase
        Auto Jeep = new Auto();

        Jeep.setColor();

        System.out.println(Jeep.dime_largo());
        System.out.println(Jeep.dime_color());
    }
}
