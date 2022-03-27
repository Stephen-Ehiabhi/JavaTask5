import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main (String[] args) {
        String word, reversedWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word: ");
        word = sc.next().toLowerCase();

        char[] splitWord =  new char[word.length()];

       for(int i = 0; i<word.length(); i++ ){
            splitWord[i] = word.charAt(i);
       }

        for(int i=splitWord.length-1; i <= splitWord.length; i--){
            if(i < 0) break;
            reversedWord += splitWord[i];
        }

       if(reversedWord.equals(word)) System.out.println("The word: " + word + " is a Palindrom!");
       else System.out.println("The word: " + word + " is not Palindrom! ");

    }
}
