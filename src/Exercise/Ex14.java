package Exercise;
//средняя по больнице

public class Ex14 {
    public static void main(String[] args) {
        float[] arr = new float[]{23.45f, 44.12f, 56.7f, 9.8f, 5.46f};
        float sum = 0;
        for (float v : arr) {
            sum = sum + v;
        }
        float res = sum / arr.length;
        System.out.println("Средняя по больнице = " + res);
    }
}

