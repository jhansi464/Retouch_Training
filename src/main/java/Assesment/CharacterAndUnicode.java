package Assesment;

public class CharacterAndUnicode {
    public static void main(String[] args) {
        char letter='A';
        int b=(char) letter;
        System.out.println("Unicode of A: " +b);
        char c= (char) (letter+1);
        System.out.println("Next letter: " +c);

    }
}
