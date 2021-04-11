package Exercise;
import java.util.Scanner;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Введите число");
        int k;
        k = num.nextInt();

        switch (k) {
            case 1 : System.out.print("пн"); break;
            case 2 : System.out.print("вт"); break;
            case 3 : System.out.print("ср"); break;
            case 4 : System.out.print("чт"); break;
            case 5 : System.out.print("пт"); break;
            case 6 : System.out.print("сб"); break;
            case 7 : System.out.print("вс"); break;
            default : System.out.print("Error"); break;
        }
    }
}