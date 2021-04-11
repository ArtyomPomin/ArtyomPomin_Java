package Exercise;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] arqs) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: "); // ограничитель предыдущего числа
        int N = num.nextInt();

        int l = 1;
        int r = 1;
        int nextNumber = 0;
        System.out.println("1");
        System.out.print("1");
        while (nextNumber<N) {
            nextNumber = l+r;
            System.out.println();
            l = r;
            r = nextNumber;
            System.out.print(nextNumber);
        }
    }
}
