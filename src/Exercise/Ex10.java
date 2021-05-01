package Exercise;

//незадачливый строитель

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int a, b; // длина и ширина отверстия
        int a1, b1, c; // длина, ширина, высота кирпича

        Scanner num = new Scanner (System.in);
        System.out.println("Введите размеры отверстия");
        System.out.println("Введите длину отверстия");
        a = num.nextInt();
        System.out.println("Введите ширину отверстия");
        b = num.nextInt();

        System.out.println("Введите размеры кирпича");
        System.out.println("Введите длину кирпича");
        a1 = num.nextInt();
        System.out.println("Введите ширину кирпича");
        b1 = num.nextInt();
        System.out.println("Введите высоту кирпича");
        c = num.nextInt();

        if (a>=a1 & b>=b1 || a>=a1 & b>=c || a>=b1 & b>=a1 || a>=b1 & b>=c || a>=c & b>=a1 || a>=c & b>=b1) {
            System.out.println("Кирпич подходит под отверстие");
        }
        else {
            System.out.println("Кирпич не подходит под отверстие");
        }

    }
}
