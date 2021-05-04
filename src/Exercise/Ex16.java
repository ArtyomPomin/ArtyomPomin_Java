package Exercise;

import java.util.Scanner;

//Анализ креативности текста

public class Ex16 {
    public static void main(String[] args) {
        String s;
        int numLetter = 0;
        int numWords = 0;
        boolean foundDiv = true;
        boolean foundChar;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст: ");
        s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ',' &&
                    s.charAt(i) != '.' &&
                    s.charAt(i) != '!' &&
                    s.charAt(i) != '?' &&
                    s.charAt(i) != ':' &&
                    s.charAt(i) != ';' &&
                    s.charAt(i) != ' ' &&
                    s.charAt(i) != '(' &&
                    s.charAt(i) != ')') {
                numLetter++;
            }
        }
        System.out.println("количество букв в тексте: " + numLetter);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '.') {
                foundDiv = true;
                foundChar = false;
            } else {
                foundChar = true;
            }
            if (foundChar && foundDiv) {
                numWords++;
                foundDiv = false;
            }
        }
        System.out.println("количество слов в тексте: " + numWords);
    }
}

