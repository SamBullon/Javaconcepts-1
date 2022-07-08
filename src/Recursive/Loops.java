package Recursive;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //string
        String w = "Palabra";
        for (int i=0; i<w.length();i++){
            System.out.print(w.charAt(i));
        }
        System.out.println();
        for (int i=w.length()-1; i>-1;i--){
            System.out.print(w.charAt(i));

        }
        System.out.println();

        // print pair numbers
        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        for (int i = 10; i >= 1; i--)
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }

        //While loop
        int i = 0;
        while(i<=10){
            System.out.println("This is Loop number" + i);
            i++;
        }
        System.out.println();

        ///While loop with ABC
        char letter = 'A';
        while (letter<='Z'){
            System.out.println("letter is : " + letter);
            letter++;
        }

        //String CharAt
        String palabra = "Victor";
        for (int n = 0; n <palabra.length(); n++){
            System.out.print(palabra.charAt(n)+" ");
        }
        System.out.println();
        for (int n = palabra.length()-1; n>-1; n--){
            System.out.print(palabra.charAt(n)+" ");
        }
        System.out.println();

        //If else
        Scanner keyboardInput = new Scanner(System.in);
        int myAge = 35;
        int ageGuess= 0;

        System.out.println("Guess what my age is ");
        if (keyboardInput.hasNextInt() == true) ageGuess = keyboardInput.nextInt();

        if (ageGuess == myAge){
            System.out.println(" you guessed "+ageGuess);
            System.out.println("You are correct");
        }else{
            System.out.println(" you guessed "+ageGuess);
            System.out.println("you are wrong");
        }





    }
}
