package RegularExpressions;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void main(String[] args) {
        final String patron;
        final String texto;
        patron = "[0-9]+";
        texto = "uno1dos2tres3cuatro";
        final String patron2 = "a[mp]";
        final String texto2 = "Estamos aprendiendo a usar expresiones regulares";


        Pattern objeto1 = Pattern.compile(patron);
        String[] items = objeto1.split(texto);
        for (String s : items){
            System.out.println(s);
        }
        Pattern objeto2 = Pattern.compile(patron2);
        //object creation or variable?
        //Creating obj of type Matcher and consuming method straight forward
        Matcher objetoMatcher = objeto2.matcher(texto2);
        String result = objetoMatcher.replaceAll("x");
        System.out.println(result);


    }


}
