package Exercise;

//незадачливый строитель

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int l, w; // длина(l) и ширина(w) отверстия
        int lB, wB, hB; // длина(lB), ширина(wB), высота(hB) кирпича

        Scanner num = new Scanner (System.in);
        System.out.println("Введите размеры отверстия");
        System.out.println("Введите длину отверстия");
        l = num.nextInt();
        System.out.println("Введите ширину отверстия");
        w = num.nextInt();

        System.out.println("Введите размеры кирпича");
        System.out.println("Введите длину кирпича");
        lB = num.nextInt();
        System.out.println("Введите ширину кирпича");
        wB = num.nextInt();
        System.out.println("Введите высоту кирпича");
        hB = num.nextInt();

        if (l>=lB & w>=wB | l>=lB & w>=hB | l>=wB & w>=lB | l>=wB & w>=hB | l>=hB & w>=lB | l>=hB & w>=wB) {
            System.out.println("Кирпич подходит под отверстие");
        }
        else {
            System.out.println("Кирпич не подходит под отверстие");
        }

    }
}
