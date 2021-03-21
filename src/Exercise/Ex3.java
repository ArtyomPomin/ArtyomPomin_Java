package Exercise;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите пятизначное число");
        int x;
        x = num.nextInt();
        if (x/10000 == x%10 && x>=10000 && x<100000) {
            System.out.println ("Это палиндром");
        }
        else if (x < 10000) {
            System.out.println("Введите пятизначное число");
        }
        else if (x > 100000) {
            System.out.println("Введите пятизначное число");
        }
        else {
            System.out.println("Это не палиндром");
        }
    }
}
