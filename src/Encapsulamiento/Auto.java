package Encapsulamiento;

public class Auto {
    /// variables private solo pueden ser usadas entro de esta clase
    private int cauchos, largo, ancho, motor, peso, peso_total;
    String color;
    boolean asientos_cuero, climatizador;



public Auto(){
    cauchos = 4;
    largo = 1000;
    ancho = 500;
    motor = 300;
    peso = 500;
}
public String dime_largo(){
    return "Largo del Auto " + largo;
}
public void setColor(){
    color = "azul";
}
public String dime_color(){
    return "Color del Auto " +  color;
}
}

