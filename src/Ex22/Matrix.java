package Ex22;

//Matrix has you

import java.util.Random;

public class Matrix {

    private int[][] array;
    int m = 0;
    int n = 0;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args) {
        Matrix array1 = new Matrix(3, 3);
        Matrix array2 = new Matrix(3, 3);
        Matrix array3 = new Matrix(4, 4);
        array1.makeMatrix();
        System.out.println();
        array2.makeMatrix();
        System.out.println("______________");
        array1.add(array2);
        array1.add(array3);
    }

    public void makeMatrix() {
        array = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(30);
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void add(Matrix x) {
        if (x.getM() == getM() && x.getN() == getN()) {
            for (int i = 0; i < getM(); i++) {
                for (int j = 0; j < getN(); j++) {
                    array[i][j] = array[i][j] + x.array[i][j];
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка, сложение невозможно");
        }
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
