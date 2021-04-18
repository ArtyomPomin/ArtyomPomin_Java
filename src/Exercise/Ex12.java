package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        int z = num.nextInt();

        int[][] arr = new int[z][z];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random r = new Random();
                arr[i][j] = r.nextInt(100);

                System.out.print(arr[i][j] + ", ");
            }
            System.out.println(" ");
        }
        int x = arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3] + arr[4][4];
        System.out.println("След матрицы = " + x);
    }
}



