package Exercise;
import java.util.Scanner;
import static java.lang.Math.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите число a ");
        double a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Введите число b ");
        double b = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Введите число c ");
        double c = num3.nextInt();

        double D = pow(b, 2) - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + sqrt(D)) / 2 * a;
            System.out.println("Первый корень X = " + ((int)x1));

            double x2 = (-b - sqrt(D)) / 2 * a;
            System.out.println("Второй корень X = " + ((int)x2));
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Корень X = " + ((int)x));
        } else
            System.out.println("Уравнение не имеет корней");

    }
}




