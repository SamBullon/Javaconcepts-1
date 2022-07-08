package Lambda;

public class Executor {
    public static void main(String[] args) {
        // this is the implementation of a method with lambda
        LambdaInterface mensaje =(name)-> System.out.println(name+" Welcome to lambda implement");
        mensaje.mensaje("Samuel");

        LambdaInterface2 calculadora =(a,b)->{
            double resultado= a+b;
            System.out.println("Resultado = "+resultado);
        };
        calculadora.operacion(10,5);
    }
}
