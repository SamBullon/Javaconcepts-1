/*
Aqui veremos lo que las clases Pattern, Matcher pueden hacer con expresiones regulares
con las expresiones regulares se pueden hacer validacions alfanumericas
 */

package ExpresionesRegulares;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpRegMain {

    public static void main(String[] args) {
        final String patron; // a esta variable se la asignara la expresion regular
        final String texto; //a esta la cadena a validar
        final String patron2;// a esta variable se la asignara la expresion regular
        final String texto2; //a esta la cadena a validar

        //a la variable la llamos patron dando entender que buscamos un dado patron dentro de una
        //cadena ya sea de texto o alfanumerica
        //la variable patron asignada a una expresion regular
        patron = "[0-9]+";//un patron 0-9 es lo q buscaremos en la cadena de texto
        texto = "uno1dos2tres4cuatro4";
        patron2 = "a[mp]";
        texto2 = "Estamos aprendiendo a usar expresiones regulares";

        //Pattern es una clase en Java de la libreria que trabaja sobre expresiones regulares
        //creamos un objeto Patter.compile para que buscara el patron en la cadena de texto
        Pattern p1 = Pattern.compile(patron);
        //Creamos un Array de tipo string llamado item y le asignamos el objeto p1 de la clase Pattern
        //.split hara la separacion del texto de las letras
        String[] items = p1.split(texto); // split divide las palabras cada q se encuentre con un numero
        //la razon de usar ciclo for es que recorra todos caracteres
        // en la variable s se almacenaran los caracteres de tipo textos encontrados
        for (String s : items){
            System.out.println(s);

        }
        Pattern p2 = Pattern.compile(patron2);

        //Matcher buscara las letras dentro de la expresion "a[mp]" osea amp
        //dentro de la cadena de texto2
        Matcher matcher = p2.matcher(texto2);
        //matcher.replace reemplazara las letras am o ap juntas por la letra x
        String result = matcher.replaceAll("x"); // reemplaza todos
        System.out.println(result);

        String cadena = "sam bullon";
        Pattern patron3 = Pattern.compile("^sam.*");
        //Matcher buscara palabra sam en cadena en caso de ser cierto imprimira valido
        Matcher mat = patron3.matcher(cadena);
        if (mat.matches()){
            System.out.println("Valido");
        }else{
            System.out.println("No Valido");
        }


    }


}
