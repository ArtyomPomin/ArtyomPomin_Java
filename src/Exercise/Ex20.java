package Exercise;

public class Ex20 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 75, 86, 99, 44, -23, 32, 16, -4, 13};
        int min = arr[0];
        int max = arr[0];

        //определение максимального числа
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число: " +max);
        // определение минимального числа
        for (int i = 0; i<arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Минимальное число: " +min);
    }
}
