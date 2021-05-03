package Exercise;

import java.util.Scanner;

//Анализ креативности текста

public class Ex16 {
    public static void main(String[] args) {
        String s;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст: ");
        s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ',' && s.charAt(i) != '.' && s.charAt(i) != '!' && s.charAt(i) != '?' && s.charAt(i) != ':' && s.charAt(i) != ';' && s.charAt(i) != ' ' && s.charAt(i) != '(' && s.charAt(i) != ')') {
                count++;
            }
        }
        System.out.println("количество букв в тексте: " + count);
    }
}
