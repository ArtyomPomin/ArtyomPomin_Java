package Exercise;
//№ 15 вычисление функций высшего порядка

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int F = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");

        try {
            F = num.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: введён неверный символ,");
        }
       if (F > 0) {
            int x = 1;
            for (int i = 1; i <= F; i++) {
                x = i * x;
                System.out.println("факториал " + i + " равен: " +x);
            }
        } else {
            System.out.println("отрицательное число");
        }
    }
}


